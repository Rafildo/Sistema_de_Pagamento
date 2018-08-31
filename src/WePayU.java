import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class WePayU {
    private int day;
    private int month;
    private int weekday;

    public void payMenu(Database database)
    {
        Calendar cal = Calendar.getInstance();
        cal.getTime();
        Scanner input = new Scanner(System.in);
        displayPayMenu();
        int choice = input.nextInt();
        switch (choice)
        {
            case 1:
                payCheck(cal,
                        database.getEmployeeArrayList(),
                        database.getHourly_employeeArrayList(),
                        database.getComissioned_employeeArrayList(),
                        database.getSalaried_employeeArrayList()
                        );
                break;

            case 2:
                payRoll(cal);
                break;
        }
    }

    public void displayPayMenu()
    {
        System.out.println("1: Pagamentos do dia");
        System.out.println("2: Avançar um dia");
    }
    public void payRoll(Calendar calendar)
    {
        calendar.add(Calendar.DAY_OF_MONTH,1);
    }
    public void payCheck(Calendar calendar,ArrayList<Employee> employee,
                         ArrayList<Hourly_Employee> hourly_employee,
                         ArrayList<Comissioned_Employee> comissioned_employees,
                         ArrayList<Salaried_Employee> salaried_employee)
    {
       calendar = Calendar.getInstance();
        day = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH);
        weekday = calendar.get(Calendar.DAY_OF_WEEK);

        for (int i = 0; i < hourly_employee.size() ; i++)
        {
            if (hourly_employee.get(i).paymentAgenda.getType().equals("Mensal"))
            {
                if (hourly_employee.get(i).paymentAgenda.getDuedatemonth() == month)
                {
                    if (hourly_employee.get(i).paymentAgenda.getDuedateday() == day)
                    {
                        System.out.println("Pagamento efetuado!");
                        System.out.println(hourly_employee.get(i).getAccumulatedsalary());
                        hourly_employee.get(i).setAccumulatedsalary(hourly_employee.get(i).getAccumulatedsalary()*-1);
                    }
                }
            }
            else if (hourly_employee.get(i).paymentAgenda.getType().equals("Semanal"))
            {
                if (hourly_employee.get(i).paymentAgenda.getDuedatemonth() == month)
                {
                    if (hourly_employee.get(i).paymentAgenda.getDuedateday() == day)
                    {
                        if (hourly_employee.get(i).paymentAgenda.getWeekday() == weekday)
                        {
                            System.out.println("Pagamento efetuado!");
                            System.out.println(hourly_employee.get(i).getAccumulatedsalary());
                            hourly_employee.get(i).setAccumulatedsalary(hourly_employee.get(i).getAccumulatedsalary()*-1);
                        }
                    }
                }
            }
        }

    }

}
