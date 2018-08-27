import java.util.ArrayList;
import java.util.Scanner;

public class Sales_Result {
    private double price;
    private String date;
    private String name;


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


    public void submitSalesResult(ArrayList<Comissioned_Employee> comissioned_employees)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome:");
        name = input.nextLine();
        Comissioned_Employee temp = findEmployee(comissioned_employees);
        if (temp == null)
        {
            System.out.println("Funcionário não encontrado");
        }
        else {

            System.out.println("Valor da venda:");
            setPrice(input.nextDouble());
            temp.setAccumulatedsalary(calculatePartialSalary(temp,getPrice()));
            System.out.println("Data:");
            setDate(input.nextLine());
        }
    }

    public double calculatePartialSalary(Comissioned_Employee comissioned_employee, double price)
    {
        return (comissioned_employee.getComission()/100) * price;
    }

    public Comissioned_Employee findEmployee(ArrayList<Comissioned_Employee> comissioned_employees)
    {
        for (int i = 0; i < comissioned_employees.size(); i++)
        {
            if (comissioned_employees.get(i).getName().equals(name))
            {
                return comissioned_employees.get(i);
            }
        }

        return null;
    }

}
