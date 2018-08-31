import java.util.Scanner;

public class Menu_Submissions {

    public void Submissions(Database database)
    {
        Scanner input = new Scanner(System.in);
        displaySubmission();
        int choice = input.nextInt();
        switch (choice)
        {
            case 1:
                timecardSubmission(database);
                break;

            case 2:
                saleSubmission(database);
                break;

            case 3:
                serviceSubmission(database);
                break;
        }
    }

    public void displaySubmission()
    {
        System.out.println("1: Lançar um cartão de ponto");
        System.out.println("2: Lançar um resultado de venda");
        System.out.println("3: Lançar uma taxa de serviço");
    }

    public void saleSubmission(Database database)
    {
        database.sales_result.submitSalesResult(database.getComissioned_employeeArrayList());
    }

    public void timecardSubmission(Database database)
    {
        database.timecard_controller.hourlyEmployeecontribution(database.getHourly_employeeArrayList());
    }

    public void serviceSubmission(Database database)
    {
        database.service_result.submitService(database.getEmployeeArrayList(),
                database.getHourly_employeeArrayList(),
                database.getComissioned_employeeArrayList(),
                database.getSalaried_employeeArrayList());
    }


}
