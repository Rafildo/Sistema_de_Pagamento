public abstract class Employee {
    private String name;
    private String type;
    private String address;
    private String paymentMethod;
    private int employeeid;
    Syndicate syndicate;
    private int syndicateid;
    private double syndicatetax;

    public Employee(Syndicate syndicate,String name, String address, String type, String paymentMethod, int employeeid)
    {
        this.syndicateid = syndicate.getSyndicateid();
        this.syndicatetax = syndicate.getSyndicatetax();
        this.name = name;
        this.type = type;
        this.address = address;
        this.paymentMethod = paymentMethod;
        this.employeeid = employeeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public abstract double calculateSalary();


}
