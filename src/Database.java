import java.util.ArrayList;

public class Database {
    Employee_Controller employee_controller = new Employee_Controller();
    private ArrayList<Employee> employeeArrayList;

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public Database()
    {
        this.employeeArrayList = new ArrayList<>();
    }
}
