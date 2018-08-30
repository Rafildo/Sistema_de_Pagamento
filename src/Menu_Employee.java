public class Menu_Employee
{
    public void employeeFunctions(Database database)
    {
        newEmployee(database);
        editEmployee(database);
        removeEmployee(database);
        editEmployeeAgenda(database);
    }

    public void newEmployee(Database database)
    {
        database.employee_controller.addEmployee(database.getEmployeeArrayList(),
                database.getHourly_employeeArrayList(),
                database.getComissioned_employeeArrayList(),
                database.getSalaried_employeeArrayList());
    }

    public void editEmployee(Database database)
    {
        database.employee_controller.editEmployee(database.getEmployeeArrayList(),
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

    public void editEmployeeAgenda(Database database)
    {
        database.paymentAgenda_controller.employeeAgenda(database.getEmployeeArrayList(),
                database.getHourly_employeeArrayList(),
                database.getComissioned_employeeArrayList(),
                database.getSalaried_employeeArrayList());
    }


}
