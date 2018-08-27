import java.util.Scanner;

public class PaymentAgenda_Controller {
    PaymentAgenda paymentAgenda = new PaymentAgenda(null,0);
    private String type;
    private int interval;

    public void getAgendaType()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Tipo: ");
        displayAgendaType();
        int choice = input.nextInt();
        switch (choice)
        {
            case 1:
                paymentAgenda.setType("Mensal");
                break;

            case 2:
                paymentAgenda.setType("Semanal");
                break;
        }
    }

    public void displayAgendaType()
    {
        System.out.println("1: Mensal");
        System.out.println("2: Semanal");
    }
}
