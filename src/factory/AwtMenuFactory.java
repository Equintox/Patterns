package factory;

import menu.Menu;
import menu.awt.AwtMenu;

public class AwtMenuFactory extends MenuFactory {

    public AwtMenuFactory(){
        factory = this;
    }

    @Override
    public Menu create() {
        return new AwtMenu();
    }
}
