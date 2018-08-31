import java.util.Calendar;
import java.util.Scanner;

public class Menu_General {

    Menu_Employee menu_employee = new Menu_Employee();
    Menu_Submissions menu_submissions = new Menu_Submissions();
    WePayU menu_pagamento = new WePayU();
    Calendar cal = Calendar.getInstance();
    public void Menu_Select(Database database)
    {
        displayMenuSelection();
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice)
        {
          case 1:
              menu_employee.employeeFunctions(cal,database);
              break;

          case 2:
              menu_submissions.Submissions(database);
              break;

          case 3:
              menu_pagamento.payMenu(cal,database);
              break;
        }
    }

    public void displayMenuSelection()
    {
        System.out.println("1: Menu de funcionários");
        System.out.println("2: Menu de lançamentos");
        System.out.println("3: Menu de pagamentos");
    }


}
