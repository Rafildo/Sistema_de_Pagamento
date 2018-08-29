import java.util.ArrayList;

public class Database {
    Employee_Controller employee_controller = new Employee_Controller();
    Timecard_Controller timecard_controller = new Timecard_Controller();
    Sales_Result sales_result = new Sales_Result();
    PaymentAgenda_Controller paymentAgenda = new PaymentAgenda_Controller();
    Service_Result service_result = new Service_Result();
    private ArrayList<Employee> employeeArrayList;
    private ArrayList<Hourly_Employee> hourly_employeeArrayList;
    private ArrayList<Comissioned_Employee> comissioned_employeeArrayList;
    private ArrayList<Salaried_Employee> salaried_employeeArrayList;

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public ArrayList<Hourly_Employee> getHourly_employeeArrayList() {
        return hourly_employeeArrayList;
    }

    public ArrayList<Comissioned_Employee> getComissioned_employeeArrayList() {
        return comissioned_employeeArrayList;
    }

    public ArrayList<Salaried_Employee> getSalaried_employeeArrayList() {
        return salaried_employeeArrayList;
    }


    public Database()
    {
        this.employeeArrayList = new ArrayList<>();
        this.hourly_employeeArrayList = new ArrayList<>();
        this.comissioned_employeeArrayList = new ArrayList<>();
        this.salaried_employeeArrayList = new ArrayList<>();
    }
}
