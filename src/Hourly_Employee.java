
public class Hourly_Employee extends Employee {

    private double workedhours;

    public Hourly_Employee(Syndicate syndicate,String name, String address, String type, String paymentMethod,double salary,
                           int workedhours,int employeeid)
    {
        super(syndicate,name,address,type,paymentMethod,salary,employeeid);
        this.workedhours = workedhours;
    }

    public double getWorkedhours() {
        return workedhours;
    }

    public void setWorkedhours(double workedhours) {
        this.workedhours = workedhours;
    }
}
