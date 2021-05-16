package pl.mj.olaf.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginMenu {

    public void showLoginMenu() {
        System.out.println("----------OLAF------------");
        System.out.println("1. Logowanie");
        System.out.println("X. Zakończ program");
        System.out.println("--------------------------");
        System.out.println("Wybierz pozycję menu:");
    }

    public boolean getMenuChoice() {
        Scanner scanner = new Scanner(System.in);
        Character menuChoice = '0';
        try {
            menuChoice = scanner.next().charAt(0);
            System.out.println(menuChoice);
        }
        catch (InputMismatchException e){
            System.out.println("to nie jest znak z listy");
        }
        //TODO validate choice
        //TODO try-catch

        if (menuChoice.equals('1')) {
            return true;
        }
        return false;
    }
}
