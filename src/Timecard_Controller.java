import java.util.ArrayList;
import java.util.Scanner;

public class Timecard_Controller {
    private ArrayList<Hourly_Employee> hourly_employees = new ArrayList<>();
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
           // returnEmployeeid(temp);
            System.out.println("Horas trabalhadas");
            temp.setWorkedhours(input.nextInt());

        }
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
