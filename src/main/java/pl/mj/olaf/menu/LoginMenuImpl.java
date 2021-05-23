package pl.mj.olaf.menu;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class LoginMenu {
    private Map<Character, String> menuOption;


//    public void showLoginMenu() {
//        System.out.println("----------OLAF------------");
//
//        System.out.println("--------------------------");
//        System.out.println("Wybierz pozycję menu:");
//    }

    public void addOptionToMenu(){
        menuOption.put('1', "Logowanie");
        menuOption.put('X', "Zakończ program");
    }

    public boolean getMenuChoice() {
        Scanner scanner = new Scanner(System.in);

        Character menuChoice = '0';
        while (menuChoice != 'x' && menuChoice!='X') {
            try {
                menuChoice = scanner.next().charAt(0);
            } catch (InputMismatchException e) {
                System.out.println("to nie jest znak z listy");
            }
            //TODO validate choice

            if (menuChoice.equals('1')) {
                return true;
            }else {
                System.out.println("Wybierz opcję z listy");
            }
        }

        return false;
    }
}
