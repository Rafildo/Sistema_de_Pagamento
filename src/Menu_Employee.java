import java.util.Calendar;
import java.util.Scanner;

public class Menu_Employee
{
    public void employeeFunctions(Calendar cal, Database database)
    {
        displayEmployeeFunctions();
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice)
        {
            case 1:
                newEmployee(database);
                break;

            case 2:
                editEmployee(database);
                break;

            case 3:
                removeEmployee(database);
                break;

            case 4:
                editEmployeeAgenda(cal,database);
                break;
                
        }
    }

    public void displayEmployeeFunctions()
    {
        System.out.println("1: Adicionar funcionário");
        System.out.println("2: Editar funcionário");
        System.out.println("3: Remover funcionário");
        System.out.println("4: Editar agenda de pagamento");
    }

    public void newEmployee(Database database)
    {
        database.employee_controller.addEmployee(database,database.getEmployeeArrayList(),
                database.getHourly_employeeArrayList(),
                database.getComissioned_employeeArrayList(),
                database.getSalaried_employeeArrayList());
    }

    public void editEmployee(Database database)
    {
        database.employee_controller.editEmployee(database,database.getEmployeeArrayList(),
                database.getHourly_employeeArrayList(),
                database.getComissioned_employeeArrayList(),
                database.getSalaried_employeeArrayList());
    }

    public void removeEmployee(Database database)
    {
        database.employee_controller.EmployeeToBeRemoved(database.getEmployeeArrayList(),
                database.getHourly_employeeArrayList(),
                database.getComissioned_employeeArrayList(),
                database.getSalaried_employeeArrayList());
    }

    public void editEmployeeAgenda(Calendar cal, Database database)
    {
        database.paymentAgenda_controller.employeeAgenda(cal,database.getEmployeeArrayList(),
                database.getHourly_employeeArrayList(),
                database.getComissioned_employeeArrayList(),
                database.getSalaried_employeeArrayList());
    }



}
