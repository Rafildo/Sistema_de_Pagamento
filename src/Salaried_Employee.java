public abstract class Salaried_Employee extends Employee {

    private double salary;

    public Salaried_Employee(String name, String address, String type, double salary, int employeeid)
    {
        super(name, address, type, employeeid);
        this.salary = salary;
    }

    double calculateSalary(double salary)
    {
        return salary;
    }
}
