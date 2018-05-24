package factory;

import menu.Menu;

public abstract class MenuFactory {

    protected static MenuFactory factory;

    public static MenuFactory getFactory() {
        return factory;
    }

    public abstract Menu create();

}
