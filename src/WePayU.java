import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class WePayU {
    private int day;
    private int month;
    private int weekday;

    public void payMenu(Calendar calendar,Database database)
    {
        Scanner input = new Scanner(System.in);
        displayPayMenu();
        int choice = input.nextInt();
        switch (choice)
        {
            case 1:
                payCheck(calendar,
                        database.getEmployeeArrayList(),
                        database.getHourly_employeeArrayList(),
                        database.getComissioned_employeeArrayList(),
                        database.getSalaried_employeeArrayList()
                        );
                break;

            case 2:
                calendar.add(Calendar.DAY_OF_MONTH,1);
                System.out.println(calendar.getTime());
                break;
        }
    }

    public void displayPayMenu()
    {
        System.out.println("1: Pagamentos do dia");
        System.out.println("2: Avançar um dia");
    }
    public void payCheck(Calendar calendar,ArrayList<Employee> employee,
                         ArrayList<Hourly_Employee> hourly_employee,
                         ArrayList<Comissioned_Employee> comissioned_employees,
                         ArrayList<Salaried_Employee> salaried_employee)
    {
        day = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH);
        weekday = calendar.get(Calendar.DAY_OF_WEEK);

        for (int i = 0; i < hourly_employee.size() ; i++)
        {
            if (hourly_employee.get(i).paymentAgenda.getType().equals("mensal"))
            {
                if (hourly_employee.get(i).paymentAgenda.getDuedatemonth() == month)
                {
                    if (hourly_employee.get(i).paymentAgenda.getDuedateday() == day)
                    {
                        System.out.println(hourly_employee.get(i).getAccumulatedsalary());
                        hourly_employee.get(i).setAccumulatedsalary(hourly_employee.get(i).getAccumulatedsalary()*-1);
                    }
                }
            }
            else if (hourly_employee.get(i).paymentAgenda.getType().equals("semanal"))
            {
                System.out.println(hourly_employee.get(i).paymentAgenda.getDuedateday());
                System.out.println(hourly_employee.get(i).paymentAgenda.getDuedatemonth());
                System.out.println(hourly_employee.get(i).paymentAgenda.getDueweekday());
                    if (hourly_employee.get(i).paymentAgenda.getDuedateday() == day)
                    {
                        if (hourly_employee.get(i).paymentAgenda.getDueweekday() == weekday)
                        {
                            System.out.println("Pagamento efetuado!");
                            hourly_employee.get(i).setAccumulatedsalary(hourly_employee.get(i).getAccumulatedsalary()*-1);
                        }
                    }
            }
        }

        for (int i = 0; i <comissioned_employees.size() ; i++)
        {
            if (comissioned_employees.get(i).paymentAgenda.getType().equals("mensal"))
            {
                if (comissioned_employees.get(i).paymentAgenda.getDuedatemonth() == month)
                {
                    if (comissioned_employees.get(i).paymentAgenda.getDuedateday() == day)
                    {
                        System.out.println(comissioned_employees.get(i).getAccumulatedsalary());
                        comissioned_employees.get(i).setAccumulatedsalary(hourly_employee.get(i).getAccumulatedsalary()*-1);
                    }
                }
            }
            else if (comissioned_employees.get(i).paymentAgenda.getType().equals("semanal"))
            {
                System.out.println(comissioned_employees.get(i).paymentAgenda.getDuedateday());
                System.out.println(comissioned_employees.get(i).paymentAgenda.getDuedatemonth());
                System.out.println(comissioned_employees.get(i).paymentAgenda.getDueweekday());
                if (comissioned_employees.get(i).paymentAgenda.getDuedateday() == day)
                {
                    if (comissioned_employees.get(i).paymentAgenda.getDueweekday() == weekday)
                    {
                        System.out.println("Pagamento efetuado!");
                        comissioned_employees.get(i).setAccumulatedsalary(comissioned_employees.get(i).getAccumulatedsalary()*-1);
                    }
                }
            }
        }

        for (int i = 0; i < salaried_employee.size() ; i++)
        {
            if (salaried_employee.get(i).paymentAgenda.getType().equals("mensal"))
            {
                if (salaried_employee.get(i).paymentAgenda.getDuedatemonth() == month)
                {
                    if (salaried_employee.get(i).paymentAgenda.getDuedateday() == day)
                    {
                        System.out.println(salaried_employee.get(i).getSalary());
                        salaried_employee.get(i).setSalary(salaried_employee.get(i).getSalary()*-1);
                    }
                }
            }
            else if (salaried_employee.get(i).paymentAgenda.getType().equals("semanal"))
            {
                System.out.println(salaried_employee.get(i).paymentAgenda.getDuedateday());
                System.out.println(salaried_employee.get(i).paymentAgenda.getDuedatemonth());
                System.out.println(salaried_employee.get(i).paymentAgenda.getDueweekday());
                if (salaried_employee.get(i).paymentAgenda.getDuedateday() == day)
                {
                    if (salaried_employee.get(i).paymentAgenda.getDueweekday() == weekday)
                    {
                        System.out.println("Pagamento efetuado!");
                        salaried_employee.get(i).setSalary(salaried_employee.get(i).getSalary()*-1);
                    }
                }
            }
        }
    }

}
