import java.util.Scanner;

public class Main {

    private final static String QUIT = "В";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);

        while (true) {

            String command = menu.inputCommand();
            if (command.matches(QUIT)) {
                System.out.println("Выход из игры");
                break;
            }

            Game game = new Game(scanner);
            game.start();

        }
    }
}


        // - abstract class Entity
        // abstract public void makeMove();

        // -- class Crosses
        // void makeMove();


        // -- class Noughts
        // void makeMove();

        // - class Map
        // коллекции хранятся существа и их место на карте
        // void store


        // - class GameLoop
        // - карта
        // - счетчик ходов
        // - рендерер поля
        // - Actions вызывает действия
        // nextTurn()
        // startSimulation

        // --- Actions
        // - вызывает каждому makeMove()




