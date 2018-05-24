import factory.AwtMenuFactory;
import factory.ConsoleMenuFactory;
import factory.MenuFactory;
import menu.Menu;

public class Main {

    public static void main(String[] args) {

        new AwtMenuFactory();

        MenuFactory factory = MenuFactory.getFactory();
        Menu menu = factory.create();

        if(menu.openMenu()){
            System.out.println("Menulogin successful");
        } else {
            System.out.println("Menulogin failed");
        }
    }
}
