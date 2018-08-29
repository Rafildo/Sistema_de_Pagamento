
public class Menu_Geral {

    Database database = new Database();
    Menu_Employee menu_employee = new Menu_Employee();
    public void Menu_Select()
    {
      menu_employee.employeeFunctions(database);
    }

    public void newHourlyEmployeeTimecard()
    {
        database.timecard_controller.hourlyEmployeecontribution(database.getHourly_employeeArrayList());
    }

    public void newSaleResult()
    {
        database.sales_result.submitSalesResult(database.getComissioned_employeeArrayList());
    }

    public void newServiceResult()
    {
        database.service_result.submitService(database.getEmployeeArrayList(),
                database.getHourly_employeeArrayList(),
                database.getComissioned_employeeArrayList(),
                database.getSalaried_employeeArrayList());
    }

    public void printEmployee()
    {
        System.out.println(database.getComissioned_employeeArrayList());
    }
}
