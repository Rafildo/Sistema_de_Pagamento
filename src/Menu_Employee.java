import java.util.Scanner;

public class Menu_Employee
{
    public void employeeFunctions(Database database)
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
                editEmployeeAgenda(database);
                break;

            case 5:
                printEmployee(database);
                break;

        }
    }

    public void displayEmployeeFunctions()
    {
        System.out.println("1: Adicionar funcionário");
        System.out.println("2: Editar funcionário");
        System.out.println("3: Remover funcionário");
        System.out.println("4: Editar agenda de pagamento");
        System.out.println("5: Printar funcionário");
    }

    public void newEmployee(Database database)
    {
        database.employee_controller.addEmployee(database,database.getEmployeeArrayList(),
                database.getHourly_employeeArrayList(),
                database.getComissioned_employeeArrayList(),
                database.getSalaried_employeeArrayList());
        printEmployee(database);
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
        printEmployee(database);
    }

    public void editEmployeeAgenda(Database database)
    {
        database.paymentAgenda_controller.employeeAgenda(database.getEmployeeArrayList(),
                database.getHourly_employeeArrayList(),
                database.getComissioned_employeeArrayList(),
                database.getSalaried_employeeArrayList());
    }

    public void printEmployee(Database database)
    {
        System.out.println(database.getHourly_employeeArrayList());
    }


}
