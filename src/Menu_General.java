
public class Menu_General {

    Menu_Employee menu_employee = new Menu_Employee();
    public void Menu_Select(Database database)
    {
      menu_employee.employeeFunctions(database);
    }

    public void newHourlyEmployeeTimecard(Database database)
    {
        database.timecard_controller.hourlyEmployeecontribution(database.getHourly_employeeArrayList());
    }

    public void newSaleResult(Database database)
    {
        database.sales_result.submitSalesResult(database.getComissioned_employeeArrayList());
    }

    public void newServiceResult(Database database)
    {
        database.service_result.submitService(database.getEmployeeArrayList(),
                database.getHourly_employeeArrayList(),
                database.getComissioned_employeeArrayList(),
                database.getSalaried_employeeArrayList());
    }

    public void printEmployee(Database database)
    {
        System.out.println(database.getComissioned_employeeArrayList());
    }
}
