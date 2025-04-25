import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
//    private final static String START = "Н";

//    private final static String COMMAND_REGEX = "[%s%s]".formatted(START, QUIT);

    private final static String QUIT = "В";
    public static final int ROW_COUNT = 3;
    public static final int COL_COUNT = 3;

    public static void main(String[] args) {

//        while (true) {
//            Menu menu = new Menu(scanner);
//            String command = menu.inputCommand();
//            if(command.matches(QUIT)) {
//                return;
//            }
        // - сюда добавить DO SOMETHING + }
//------------------------------------------начать и выйти ГОТОВО-----------------------

//            Map<Player, Coordinates> board = new HashMap<>();
//
        Board board = new Board();

        System.out.println("Введите 2е цифры через пробел: 1я - ряд, 2я - колонка");

        InputPerson inputPerson = new InputPerson(board);
        inputPerson.inputCoordinates(scanner);
        int rowPlayer = inputPerson.getRowPerson();
        int colPlayer = inputPerson.getColPerson();

        Person player = new Person("Cross");
        Coordinates coordinatesPers = new Coordinates(rowPlayer, colPlayer);

        board.addPlayer(coordinatesPers, player);
        board.renderBoard();

        System.out.println("Ход бота");

        InputBot inputBot = new InputBot();
        int rowBot = inputBot.getRow();
        int colBot = inputBot.getCol();

        Bot bot = new Bot("Nought");
        Coordinates coordinatesBot = new Coordinates(rowBot, colBot);

        board.addPlayer(coordinatesBot, bot);
        board.renderBoard();







//            for (int row = 0; row < ROW_COUNT; row++) {
//                System.out.print("|");
//                for (int col = 0; col < COL_COUNT; col++) {
//                    System.out.print("  |");
//                }
//                System.out.println();
//            }

            int p = 12;

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




