import java.util.ArrayList;
import java.util.Scanner;

public class Service_Result {

    public void submitService(ArrayList<Employee> employee,
                              ArrayList<Hourly_Employee> hourly_employee,
                              ArrayList<Comissioned_Employee> comissioned_employee,
                              ArrayList<Salaried_Employee> salaried_employee)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Identificação do serviço");
        String serviceid = input.nextLine();
        System.out.println("Valor do serviço");
        double servicevalue = input.nextDouble();
        System.out.println("Nome do funcionário");
        String name = input.nextLine();
        serviceAdd(name,servicevalue,employee,hourly_employee,comissioned_employee,salaried_employee);
    }

    public void serviceAdd(String name,double servicevalue,ArrayList<Employee> employee,
                           ArrayList<Hourly_Employee> hourly_employee,
                           ArrayList<Comissioned_Employee> comissioned_employee,
                           ArrayList<Salaried_Employee> salaried_employee)
    {
        for (int i = 0; i < employee.size() ; i++)
        {
            if (employee.get(i).getName().equals(name))
            {
                employee.get(i).setSalarydeductions(servicevalue);
                break;
            }
        }

        for (int i = 0; i < hourly_employee.size() ; i++)
        {
            if (hourly_employee.get(i).getName().equals(name))
            {
                hourly_employee.get(i).setSalarydeductions(servicevalue);
                break;
            }
        }
        for (int i = 0; i < comissioned_employee.size() ; i++)
        {
            if (comissioned_employee.get(i).getName().equals(name))
            {
                comissioned_employee.get(i).setSalarydeductions(servicevalue);
                break;
            }
        }
        for (int i = 0; i < salaried_employee.size() ; i++)
        {
            if (salaried_employee.get(i).getName().equals(name))
            {
                salaried_employee.get(i).setSalarydeductions(servicevalue);
                break;
            }
        }


    }
}
