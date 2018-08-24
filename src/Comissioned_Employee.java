public abstract class Comissioned_Employee extends Employee {

    private double salary;

    public Comissioned_Employee(String name, String address, String type, double salary, int employeeid)
    {
        super(name,address,type,employeeid);
        this.salary = salary;
    }

    double calculateSalary(double salary)
    {
        return salary;
    }

}
