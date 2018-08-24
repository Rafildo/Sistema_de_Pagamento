
public abstract class Hourly_Employee extends Employee {

    private double salary;

    public Hourly_Employee(String name, String address, String type, double salary,int employeeid)
    {
        super(name,address,type,employeeid);
        this.salary = salary;
    }

    double calculateSalary(double salary)
    {
        return salary;
    }
}
