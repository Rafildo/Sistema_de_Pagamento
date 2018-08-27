import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Employee_Controller {
    Employee employeeset = new Employee(null,null,null,null,null,-1,-2);

    public void addEmployee(ArrayList<Employee> employee,ArrayList<Hourly_Employee> hourly_employee,
                            ArrayList<Comissioned_Employee> comissioned_employee,ArrayList<Salaried_Employee> salaried_employee)
    {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        System.out.println("Nome:");
        employeeset.setName(input.nextLine());
        System.out.println("Endereço:");
        employeeset.setAddress(input.nextLine());
        System.out.println("Forma de pagamento:");
        employeeset.setPaymentMethod(input.nextLine());
        System.out.println("Tipo:");
        displayTypeSelection();
        typeSelection(employee,hourly_employee,comissioned_employee,salaried_employee);
        employeeset.setEmployeeid(generator.nextInt(10000));
        /*employee.add(new Employee(null,employeeset.getName(),employeeset.getAddress(),employeeset.getType(),
                employeeset.getPaymentMethod(), employeeset.getEmployeeid()));*/



    }

    public void typeSelection(ArrayList<Employee> employee,ArrayList<Hourly_Employee> hourly_employee,
                              ArrayList<Comissioned_Employee> comissioned_employee,
                              ArrayList<Salaried_Employee> salaried_employee)
    {
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Salário por hora");
                employeeset.setSalary(input.nextDouble());
                input.nextLine();
                employee.add(new Hourly_Employee(null,employeeset.getName(),employeeset.getAddress(),"Horista",
                        employeeset.getPaymentMethod(),employeeset.getSalary(),0,0 ,
                        employeeset.getEmployeeid()));
                hourly_employee.add(new Hourly_Employee(null,employeeset.getName(),employeeset.getAddress(),"Horista",
                        employeeset.getPaymentMethod(),employeeset.getSalary(),0,0,
                        employeeset.getEmployeeid()));
                break;
            case 2:
                employee.add(new Salaried_Employee(null,employeeset.getName(),employeeset.getAddress(),"Assalariado",
                        employeeset.getPaymentMethod(),returnMonthlySalary(), employeeset.getEmployeeid()));
                salaried_employee.add(new Salaried_Employee(null,employeeset.getName(),employeeset.getAddress(),"Assalariado",
                        employeeset.getPaymentMethod(),returnMonthlySalary(), employeeset.getEmployeeid()));
                break;
            case 3:
                Comissioned_Employee comissionedemployeeset = new Comissioned_Employee(null,null,
                        null,null,null,0.0,0.0,-3,0.0);
                System.out.println("Salário fixo");
                employeeset.setSalary(input.nextDouble());
                System.out.println("Comissão");
                comissionedemployeeset.setComission(input.nextDouble());

                employee.add(new Comissioned_Employee(null,employeeset.getName(),employeeset.getAddress(),
                        "Comissionado", employeeset.getPaymentMethod(),employeeset.getSalary(),0,
                        employeeset.getEmployeeid(),comissionedemployeeset.getComission()));
                comissioned_employee.add(new Comissioned_Employee(null,employeeset.getName(),employeeset.getAddress(),
                        "Comissionado", employeeset.getPaymentMethod(),employeeset.getSalary(),0,
                        employeeset.getEmployeeid(),comissionedemployeeset.getComission()));
                break;

        }
    }


    public double returnMonthlySalary()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Salário mensal");
        employeeset.setSalary(input.nextDouble());
        return employeeset.getSalary();
    }

    public double returnFixedSalary()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Salário fixo");
        employeeset.setSalary(input.nextDouble());
        return employeeset.getSalary();
    }

    public double returnComission()
    {
        Comissioned_Employee comissioned_employee = new Comissioned_Employee(null,null,null,
                null,null,0,0.0,0,0.0);
        Scanner input = new Scanner(System.in);
        System.out.println("Comissão sobre o valor das vendas (em %)");
        comissioned_employee.setComission(input.nextDouble());
        return employeeset.getSalary()/100;

    }

    public void displayTypeSelection()
    {
        System.out.println("Categorias");
        System.out.println("1: Horista");
        System.out.println("2: Assalariado");
        System.out.println("3: Comissionado");
    }
}
