package pl.mj.olaf.menu;

import java.util.Scanner;

public class LoginMenu {

    public void showLoginMenu() {
        System.out.println("----------OLAF------------");
        System.out.println("1. Logowanie");
        System.out.println("0. Zakończ program");
        System.out.println("--------------------------");
        System.out.println("Wybierz pozycję menu:");
    }

    public boolean getMenuChoice() {
        Scanner scanner = new Scanner(System.in);
        int menuChoice = scanner.nextInt();
        if (menuChoice == 1) {
            return true;
        }
        return false;
    }
}
