
public class Menu_Geral {

    Database database = new Database();
    public void newEmployee()
    {
      database.employee_controller.addEmployee(database.getEmployeeArrayList(),
              database.getHourly_employeeArrayList(),
              database.getComissioned_employeeArrayList(),
              database.getSalaried_employeeArrayList());
    }

    public void newHourlyEmployeeTimecard()
    {
        database.timecard_controller.hourlyEmployeecontribution(database.getHourly_employeeArrayList());
    }

    public void newSaleResult()
    {
        database.sales_result.submitSalesResult(database.getComissioned_employeeArrayList());
    }

    public void printEmployee()
    {
        System.out.println(database.getComissioned_employeeArrayList());
    }
}
