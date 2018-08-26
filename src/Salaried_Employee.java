public class Salaried_Employee extends Employee {

    private double salary;

    public Salaried_Employee(Syndicate syndicate, String name, String address, String type,String paymentMethod,
                             double salary, int employeeid)
    {
        super(syndicate,name,address,type,paymentMethod,salary,employeeid);
    }

    double calculateSalary(double salary)
    {
        return salary;
    }
}
