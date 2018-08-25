public class Syndicate {

    private double syndicatetax;
    private int syndicateid;

    public double getSyndicatetax() {
        return syndicatetax;
    }

    public void setSyndicatetax(double syndicatetax) {
        this.syndicatetax = syndicatetax;
    }

    public int getSyndicateid() {
        return syndicateid;
    }

    public void setSyndicateid(int syndicateid) {
        this.syndicateid = syndicateid;
    }

    public Syndicate(Employee employee, int syndicateid, double syndicatetax)
    {
        this.syndicateid = syndicateid;
        this.syndicatetax = syndicatetax;
    }
}
