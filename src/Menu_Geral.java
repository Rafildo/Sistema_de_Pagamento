
public class Menu_Geral {

    Database database = new Database();
    public void newEmployee()
    {
      database.employee_controller.addEmployee(database.getEmployeeArrayList(),
              database.getHourly_employeeArrayList(),
              database.getComissioned_employeeArrayList(),
              database.getSalaried_employeeArrayList());
    }

    public void newHourlyEmployeeContribution()
    {
        database.timecard_controller.hourlyEmployeecontribution(database.getHourly_employeeArrayList());
    }

    public void printEmployee()
    {
        System.out.println(database.getHourly_employeeArrayList());
    }
}
