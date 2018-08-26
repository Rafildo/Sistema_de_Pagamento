import java.util.Scanner;

public class Timecard {

    private int id;
    private int dailyhours;

    public Timecard(Employee employee,int dailyhours)
    {
        this.id = employee.getEmployeeid();
        this.dailyhours = dailyhours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDailyhours() {
        return dailyhours;
    }

    public void setDailyhours(int dailyhours) {
        this.dailyhours = dailyhours;
    }

}
