import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Employee_Controller {
    Employee employeeset = new Employee(null,null,null,null,null,null,-1,-2);

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
        System.out.println("Pertence ao sindicato?");
        System.out.println("Tipo:");
        displayTypeSelection();
        typeSelection(employee,hourly_employee,comissioned_employee,salaried_employee);
        employeeset.setEmployeeid(generator.nextInt(10000));



    }
    public void syndicateCheck()
    {

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
                employee.add(new Hourly_Employee(null,new PaymentAgenda("semanal",1,"sexta"),
                        employeeset.getName(),employeeset.getAddress(),"Horista",
                        employeeset.getPaymentMethod(),employeeset.getSalary(),0,0 ,
                        employeeset.getEmployeeid()));
                hourly_employee.add(new Hourly_Employee(null,new PaymentAgenda("semanal",1,"sexta"),
                        employeeset.getName(),employeeset.getAddress(),"Horista",
                        employeeset.getPaymentMethod(),employeeset.getSalary(),0,0,
                        employeeset.getEmployeeid()));
                break;

            case 2:
                System.out.println("Salário mensal");
                employeeset.setSalary(input.nextDouble());
                input.nextLine();
                employee.add(new Salaried_Employee(null,new PaymentAgenda("mensal",30,null),
                        employeeset.getName(),employeeset.getAddress(),"Assalariado",
                        employeeset.getPaymentMethod(),employeeset.getSalary(), employeeset.getEmployeeid()));
                salaried_employee.add(new Salaried_Employee(null,new PaymentAgenda("mensal",30,null),
                        employeeset.getName(),employeeset.getAddress(),"Assalariado",
                        employeeset.getPaymentMethod(),employeeset.getSalary(), employeeset.getEmployeeid()));
                break;

            case 3:
                Comissioned_Employee comissionedemployeeset = new Comissioned_Employee(null,null,null,
                        null,null,null,0.0,0.0,-3,0.0);
                System.out.println("Salário fixo");
                employeeset.setSalary(input.nextDouble());
                System.out.println("Comissão");
                comissionedemployeeset.setComission(input.nextDouble());
                employee.add(new Comissioned_Employee(null,new PaymentAgenda("semanal",2,"sexta"),
                        employeeset.getName(),employeeset.getAddress(), "Comissionado",
                        employeeset.getPaymentMethod(),employeeset.getSalary(),0,
                        employeeset.getEmployeeid(),comissionedemployeeset.getComission()));
                comissioned_employee.add(new Comissioned_Employee(null,new PaymentAgenda("semanal",2,"sexta"),
                        employeeset.getName(),employeeset.getAddress(), "Comissionado",
                        employeeset.getPaymentMethod(),employeeset.getSalary(),0,
                        employeeset.getEmployeeid(),comissionedemployeeset.getComission()));
                break;

        }
    }



    public void displayTypeSelection()
    {
        System.out.println("Categorias");
        System.out.println("1: Horista");
        System.out.println("2: Assalariado");
        System.out.println("3: Comissionado");
    }
}
