package factory;

import menu.Menu;
import menu.console.ConsoleMenu;

public class ConsoleMenuFactory extends MenuFactory {

    public ConsoleMenuFactory(){
        factory = this;
    }

    @Override
    public Menu create() {
        return new ConsoleMenu();
    }
}
