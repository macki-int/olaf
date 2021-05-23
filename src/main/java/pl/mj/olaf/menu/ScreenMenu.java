package pl.mj.olaf.menu;

public class ScreenMenu {
    public Character showMenu(Menu menu) {
        menu.addOptionToMenu();
        System.out.println("----------OLAF------------");
        menu.showMenu();
        System.out.println("Wybierz pozycję menu:");
        return menu.getMenuChoice();
    }
}
