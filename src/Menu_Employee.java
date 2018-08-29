public class Menu_Employee
{
    public void employeeFunctions(Database database)
    {
        newEmployee(database);
        editEmployee(database);
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
        
    }


}
