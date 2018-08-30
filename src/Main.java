public class Main {
    public static boolean var = false;
    public static void main(String[] args)
    {
        while(!var) {
           Menu_General menu_general = new Menu_General();
           menu_general.Menu_Select();
        }
    }
}
