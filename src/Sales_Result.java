import java.util.Scanner;

public class Sales_Result {
    private int id;
    private double price;
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Sales_Result(Employee employee, int id, double price, String date)
    {
        this.id = employee.getEmployeeid();
        this.price = price;
        this.date = date;
    }

    public void submitSalesResult()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor da venda:");
        setPrice(input.nextDouble());
        System.out.println("Data:");
        setDate(input.nextLine());
    }
}
