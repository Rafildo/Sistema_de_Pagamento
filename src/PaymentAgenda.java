public class PaymentAgenda {
    private String type;
    private int interval;

    public PaymentAgenda(String type,int interval)
    {
        this.type = type;
        this.interval = interval;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }
}
