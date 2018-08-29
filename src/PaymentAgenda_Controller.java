import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class PaymentAgenda_Controller {
    PaymentAgenda paymentAgenda = new PaymentAgenda(null,0,null);

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

    public Date paymentDate(PaymentAgenda paymentAgenda)
    {
        Calendar cal = Calendar.getInstance();
        if (paymentAgenda.getType().equals("Mensal"))
        {
            paymentAgenda.setDuedatemonth(cal.roll(Calendar.MONTH,true));
        }

    }
}
