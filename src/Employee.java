public class Employee {
    private String name;
    private String type;
    private String address;
    private String paymentMethod;
    private double salary;
    private int employeeid;
    private int syndicateid;
    private double syndicatetax;
    PaymentAgenda paymentAgenda;
    Syndicate syndicate;

    public Employee(Syndicate syndicate,PaymentAgenda paymentAgenda,String name, String address, String type, String paymentMethod, double salary, int employeeid)
    {
//        this.syndicateid = syndicate.getSyndicateid();
        //this.syndicatetax = syndicate.getSyndicatetax();
        this.paymentAgenda = new PaymentAgenda(null,0,null);
        this.name = name;
        this.type = type;
        this.address = address;
        this.paymentMethod = paymentMethod;
        this.employeeid = employeeid;
        this.salary = salary;
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

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Syndicate getSyndicate() {
        return syndicate;
    }

    public void setSyndicate(Syndicate syndicate) {
        this.syndicate = syndicate;
    }

    public int getSyndicateid() {
        return syndicateid;
    }

    public void setSyndicateid(int syndicateid) {
        this.syndicateid = syndicateid;
    }

    public double getSyndicatetax() {
        return syndicatetax;
    }

    public void setSyndicatetax(double syndicatetax) {
        this.syndicatetax = syndicatetax;
    }

    public String toString()
    {
        return(this.getName() + System.lineSeparator()+ this.getType() + System.lineSeparator() + this.getAddress()
            + System.lineSeparator() + this.getType() + System.lineSeparator() + this.getPaymentMethod() +
            System.lineSeparator() + this.getEmployeeid() + System.lineSeparator());

    }
}
