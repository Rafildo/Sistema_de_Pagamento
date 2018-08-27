import java.util.ArrayList;
import java.util.Scanner;

public class Timecard_Controller {
    private String name;

    public void hourlyEmployeecontribution(ArrayList<Hourly_Employee> hourly_employees)
    {
        submitWorkedHours(hourly_employees);
    }

    public void submitWorkedHours(ArrayList<Hourly_Employee> hourly_employees)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome");
        name = input.nextLine();
        Hourly_Employee temp = findEmployee(hourly_employees);
        if(temp == null)
        {
            System.out.println("Não foi encontrado funcionário");

        }
        else {
            System.out.println("Horas trabalhadas");
            temp.setWorkedhours(input.nextInt());
            temp.setAccumulatedsalary(calculateSalary(temp.getWorkedhours(),temp));

        }
    }

    public double calculateSalary(int hours,Hourly_Employee hourly_employee)
    {
        if (hours <= 8)
        {
           return calculateNormalHoursSalary(hours,hourly_employee);
        }
        else
        {
            return(calculateExtraHoursSalary(hours,hourly_employee) + calculateNormalHoursSalary(8,hourly_employee));
        }
    }


    public double calculateNormalHoursSalary(int hours, Hourly_Employee hourly_employee)
    {
        return hours*(hourly_employee.getSalary());
    }

    public double calculateExtraHoursSalary(int hours, Hourly_Employee hourly_employee)
    {
        return (hours%8)*(hourly_employee.getSalary()*1.5);
    }
    public Hourly_Employee findEmployee(ArrayList<Hourly_Employee> hourly_employees)
    {
        for (int i = 0; i < hourly_employees.size(); i++)
        {
            if (hourly_employees.get(i).getName().equals(name))
            {
               return hourly_employees.get(i);
            }
        }

        return null;
    }

}
