public class Comissioned_Employee extends Employee {

    private double comission;
    private double accumulatedsalary;

    public Comissioned_Employee(Syndicate syndicate,PaymentAgenda paymentAgenda,String name, String address, String type,
                                String paymentMethod, double salary,double accumulatedsalary, int employeeid, double comission)
    {
        super(syndicate,paymentAgenda,name,address,type,paymentMethod,salary,employeeid);
        this.comission = comission;
        this.accumulatedsalary = accumulatedsalary;
    }

    public double getAccumulatedsalary() {
        return accumulatedsalary;
    }

    public void setAccumulatedsalary(double accumulatedsalary) {
        this.accumulatedsalary += accumulatedsalary;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    public String toString()
    {
        return (this.getName() + System.lineSeparator() + this.getAccumulatedsalary() +
                System.lineSeparator() + this.getComission() + "%");
    }

}
