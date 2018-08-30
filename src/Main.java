public class Main {
    public static Menu_General menu_general = new Menu_General();
    public static Database database = new Database();
    public static boolean var = false;
    public static void main(String[] args)
    {
        while(!var) {
           menu_general.Menu_Select(database);
        }
    }
}
