import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    private final static String START = "Н";
    private final static String QUIT = "В";
    private final static String COMMAND_REGEX = "[%s%s]".formatted(START, QUIT);

    public static void main(String[] args) {

        Menu menu = new Menu(scanner);
        menu.inputCommand();





        scanner.close();




            //Map<Coordinates, String> board = new HashMap<>();



        //}
    }



        private static boolean isValidCommand(String command){
            return command.length() == 1 && command.matches(COMMAND_REGEX);
        }


//
//            System.out.println("Введите 2 числа через пробел: 1-е это ряд, 2-е это колонка");
//
//
//
//        }


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



