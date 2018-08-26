import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Employee_Controller {
    Employee employeeset = new Employee(null,null,null,null,null,-1);

    public void addEmployee(ArrayList<Employee> employee)
    {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        System.out.println("Nome:");
        employeeset.setName(input.nextLine());
        System.out.println("Endereço:");
        employeeset.setAddress(input.nextLine());
        System.out.println("Tipo:");
        employeeset.setType(input.nextLine());
        System.out.println("Forma de pagamento:");
        employeeset.setPaymentMethod(input.nextLine());
        employeeset.setEmployeeid(generator.nextInt(10000));
        employee.add(new Employee(null,employeeset.getName(),employeeset.getAddress(),employeeset.getType(),
                employeeset.getPaymentMethod(), employeeset.getEmployeeid()));



    }
}
