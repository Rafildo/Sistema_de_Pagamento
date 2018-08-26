
public class Menu_Geral {

    Database database = new Database();
    public void newEmployee()
    {
      database.employee_controller.addEmployee(database.getEmployeeArrayList());
    }

    public void printEmployee()
    {
        System.out.println(database.getEmployeeArrayList().toString());
    }
}
