package controller;

public class LoginController {

    public boolean checkLogin(String username, String password){

        if(username.equals("admin") && password.equals("admin")){
            //System.out.println("Login successful");
            return true;
        }
        //System.out.println("Invalid username or password");
        return false;
    }
}
