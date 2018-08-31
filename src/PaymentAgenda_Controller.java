import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class PaymentAgenda_Controller {
    PaymentAgenda paymentAgenda = new PaymentAgenda(null,0,0);

    public void employeeAgenda(Calendar cal,ArrayList<Employee> employee, ArrayList<Hourly_Employee> hourly_employee,
                               ArrayList<Comissioned_Employee> comissioned_employee,
                               ArrayList<Salaried_Employee> salaried_employee)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome do funcionário");
        String name = input.nextLine();
        setAgenda(cal);
        setEmployeeAgenda(name,employee,hourly_employee,comissioned_employee,salaried_employee);
    }

    public void setEmployeeAgenda(String name,ArrayList<Employee> employee, ArrayList<Hourly_Employee> hourly_employee,
                                  ArrayList<Comissioned_Employee> comissioned_employee,
                                  ArrayList<Salaried_Employee> salaried_employee)
    {
        for (int i = 0; i < employee.size(); i++)
        {
            if (employee.get(i).getName().equals(name))
            {
                employee.get(i).setPaymentAgenda(new PaymentAgenda(paymentAgenda.getType()
                        ,paymentAgenda.getInterval(),paymentAgenda.getDateday()));
                break;
            }
        }
        for (int i = 0; i < hourly_employee.size(); i++)
        {
            if (hourly_employee.get(i).getName().equals(name))
            {
                hourly_employee.get(i).setPaymentAgenda(new PaymentAgenda(paymentAgenda.getType()
                        ,paymentAgenda.getInterval(),paymentAgenda.getDateday()));
                break;
            }
        }
        for (int i = 0; i <comissioned_employee.size(); i++)
        {
            if (comissioned_employee.get(i).getName().equals(name))
            {
                comissioned_employee.get(i).setPaymentAgenda(new PaymentAgenda(paymentAgenda.getType()
                        ,paymentAgenda.getInterval(),paymentAgenda.getDateday()));
                break;
            }
        }
        for (int i = 0; i < salaried_employee.size(); i++)
        {
            if (salaried_employee.get(i).getName().equals(name))
            {
                salaried_employee.get(i).setPaymentAgenda(new PaymentAgenda(paymentAgenda.getType()
                        ,paymentAgenda.getInterval(),paymentAgenda.getDateday()));
                break;
            }
        }
    }

    public void setAgenda(Calendar cal)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Tipo: ");
        displayAgendaType();
        int choice = input.nextInt();
        switch (choice)
        {
            case 1:
                paymentAgenda.setType("mensal");
                setAgendaInterval();
                break;

            case 2:
                paymentAgenda.setType("semanal");
                setAgendaInterval();
                setAgendaWeekDay();
                break;
        }
        setDuePaymentDate(cal);
    }

    public void setAgendaInterval()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Intervalo");
        paymentAgenda.setInterval(input.nextInt());
    }

    public void setAgendaWeekDay()
    {
        Scanner input = new Scanner(System.in);
        displayWeekDays();
        int choice = input.nextInt();
        switch (choice)
        {
            case 2:
                paymentAgenda.setWeekday(2);
                break;

            case 3:
                paymentAgenda.setWeekday(3);
                break;

            case 4:
                paymentAgenda.setWeekday(4);
                break;

            case 5:
                paymentAgenda.setWeekday(5);
                break;

            case 6:
                paymentAgenda.setWeekday(6);
                break;
        }

    }

    public void displayWeekDays()
    {
        System.out.println("2: Segunda-feira");
        System.out.println("3: Terça-feira");
        System.out.println("4: Quarta-feira");
        System.out.println("5: Quinta-feira");
        System.out.println("6: Sexta-feira");
    }

    public void displayAgendaType()
    {
        System.out.println("1: mensal");
        System.out.println("2: semanal");
    }

    public void setDuePaymentDate(Calendar cal)
    {
        cal.getTime();
        if (paymentAgenda.getType().equals("mensal"))
        {
            cal.add(Calendar.MONTH,1);
            paymentAgenda.setDuedatemonth(cal.get(Calendar.MONTH));
            paymentAgenda.setDuedateday(cal.get(Calendar.DAY_OF_MONTH));
        }
        else if (paymentAgenda.getType().equals("semanal"))
        {
            cal.add(Calendar.WEEK_OF_MONTH,paymentAgenda.getInterval());
            paymentAgenda.setDuedatemonth(cal.get(Calendar.MONTH));
            paymentAgenda.setDuedateday(cal.get(Calendar.DAY_OF_MONTH));
            switch (paymentAgenda.getWeekday())
            {
                case 2:
                    paymentAgenda.setDueweekday(2);
                    break;
                case 3 :
                    paymentAgenda.setDueweekday(3);
                    break;
                case 4:
                    paymentAgenda.setDueweekday(4);
                    break;

                case 5:
                    paymentAgenda.setDueweekday(5);
                    break;

                case 6:
                    paymentAgenda.setDueweekday(6);
                    break;
            }
        }

    }
}
