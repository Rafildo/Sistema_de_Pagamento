import java.util.ArrayList;
import java.util.Calendar;

public class WePayU {
    private int day;
    private int month;
    private int weekday;

    public void payCheck(ArrayList<Employee> employee,
                         ArrayList<Hourly_Employee> hourly_employee,
                         ArrayList<Comissioned_Employee> comissioned_employees,
                         ArrayList<Salaried_Employee> salaried_employee)
    {
        Calendar cal = Calendar.getInstance();
        day = cal.get(Calendar.DAY_OF_MONTH);
        month = cal.get(Calendar.MONTH);
        weekday = cal.get(Calendar.DAY_OF_WEEK);

    }
}
