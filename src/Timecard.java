import java.util.Scanner;

public class Timecard {

    private int id;
    private int dailyhours;

    public Timecard(Employee employee,int dailyhours)
    {
        this.id = employee.getEmployeeid();
        this.dailyhours = dailyhours;
    }

    public int getDailyhours() {
        return dailyhours;
    }

    public void setDailyhours(int dailyhours) {
        this.dailyhours = dailyhours;
    }

    public void submitWorkedHours()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Horas trabalhadas");
        setDailyhours(input.nextInt());
    }
}
