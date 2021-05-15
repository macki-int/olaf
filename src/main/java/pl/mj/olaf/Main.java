package pl.mj.olaf;

import pl.mj.olaf.menu.LoginMenu;

public class Main {
    public static void main(String[] args) {
        LoginMenu loginMenu = new LoginMenu();
        loginMenu.showLoginMenu();
        loginMenu.getMenuChoice();

    }
}
