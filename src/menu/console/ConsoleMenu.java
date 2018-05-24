package menu.console;

import controller.LoginController;
import menu.Menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleMenu implements Menu {

    private String username;
    private String password;

    public ConsoleMenu(){
    }

    private boolean login(){
        System.out.println("Username: ");

        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

        try {
            username = bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Password: ");

        bufferRead = new BufferedReader(new InputStreamReader(System.in));
        try {
            password = bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        LoginController controller = new LoginController();

        if(!controller.checkLogin(username,password)){
            login();
        } else {
            return true;
        }
        return false; //will never reach this
    }

    @Override
    public boolean openMenu() {
        login();

        return true;
    }
}
