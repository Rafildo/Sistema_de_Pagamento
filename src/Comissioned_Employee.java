public class Comissioned_Employee extends Employee {

    private double comission;

    public Comissioned_Employee(Syndicate syndicate,String name, String address, String type,
                                String paymentMethod, double salary, int employeeid, double comission)
    {
        super(syndicate,name,address,type,paymentMethod,salary,employeeid);
        this.comission = comission;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    double calculateSalary(double salary)
    {
        return salary;
    }

}
