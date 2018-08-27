public class PaymentAgenda {
    private String type;
    private int interval;
    private String day;

    public PaymentAgenda(String type,int interval,String day)
    {
        this.type = type;
        this.interval = interval;
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
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
