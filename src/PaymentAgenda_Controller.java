import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class PaymentAgenda_Controller {
    PaymentAgenda paymentAgenda = new PaymentAgenda(null,0,null);

    public void setAgenda()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Tipo: ");
        displayAgendaType();
        int choice = input.nextInt();
        switch (choice)
        {
            case 1:
                paymentAgenda.setType("Mensal");
                setAgendaInterval();
                break;

            case 2:
                paymentAgenda.setType("Semanal");
                setAgendaInterval();
                setAgendaWeekDay();
                break;
        }
        setDuePaymentDate(paymentAgenda);
    }

    public void setAgendaInterval()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Intervalo");
        paymentAgenda.setInterval(input.nextInt());
    }

    public void setAgendaWeekDay()
    {
        Scanner input = new Scanner(System.in);
        displayWeekDays();
        int choice = input.nextInt();
        switch (choice)
        {
            case 2:
                paymentAgenda.setWeekday("segunda");
                break;

            case 3:
                paymentAgenda.setWeekday("terça");
                break;

            case 4:
                paymentAgenda.setWeekday("quarta");
                break;

            case 5:
                paymentAgenda.setWeekday("quinta");
                break;

            case 6:
                paymentAgenda.setWeekday("sexta");
                break;
        }

    }

    public void displayWeekDays()
    {
        System.out.println("2: Segunda-feira");
        System.out.println("3: Terça-feira");
        System.out.println("4: Quarta-feira");
        System.out.println("5: Quinta-feira");
        System.out.println("6: Sexta-feira");
    }

    public void displayAgendaType()
    {
        System.out.println("1: Mensal");
        System.out.println("2: Semanal");
    }

    public void setDuePaymentDate(PaymentAgenda paymentAgenda)
    {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        if (paymentAgenda.getType().equals("Mensal"))
        {
            cal.add(Calendar.MONTH,1);
            paymentAgenda.setDuedatemonth(cal.get(Calendar.MONTH));
            paymentAgenda.setDuedateday(cal.get(Calendar.DAY_OF_MONTH));
        }
        else if (paymentAgenda.getType().equals("Semanal"))
        {
            cal.add(Calendar.WEEK_OF_MONTH,paymentAgenda.getInterval());
            paymentAgenda.setDuedatemonth(cal.get(Calendar.MONTH));
            paymentAgenda.setDuedateday(cal.get(Calendar.DAY_OF_MONTH));
            switch (paymentAgenda.getWeekday())
            {
                case "segunda":
                    paymentAgenda.setDueweekday(2);
                    break;
                case "terça" :
                    paymentAgenda.setDueweekday(3);
                    break;
                case "quarta":
                    paymentAgenda.setDueweekday(4);
                    break;

                case "quinta":
                    paymentAgenda.setDueweekday(5);
                    break;

                case "sexta":
                    paymentAgenda.setDueweekday(6);
                    break;
            }
        }

    }
}
