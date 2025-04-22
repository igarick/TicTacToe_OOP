import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    private final static String START = "Н";
    private final static String QUIT = "В";
    private final static String COMMAND_REGEX = "[%s%s]".formatted(START, QUIT);

    public static void main(String[] args) {
        while (true) {
            System.out.println("(Н)ачать игру или (В)ыйти");

            String command = inputCommand();
            if (command.equals(QUIT)) {
                return;
            }

            startGameLoop();
            System.out.println();
        }
    }

        static String inputCommand() {
            while (true) {
                String command = scanner.next().toUpperCase();
                if (!isValidCommand(command)) {
                    System.out.printf("Введите букву %s или %s %n", START, QUIT);
                } else {
                    return command;
                }
            }
        }

        private static boolean isValidCommand(String command){
            return command.length() == 1 && command.matches(COMMAND_REGEX);
        }

        public void startGameLoop() {

            System.out.println("Введите 2 числа через пробел: 1-е это ряд, 2-е это колонка");



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
    }



