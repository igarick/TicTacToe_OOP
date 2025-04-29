import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
//    private final static String START = "Н";

//    private final static String COMMAND_REGEX = "[%s%s]".formatted(START, QUIT);

    private final static String QUIT = "В";


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

        InputPerson input = new InputPerson();
        input.inputCoordinates(scanner, board);
        int row = input.getRow();
        int col = input.getCol();

        Person person = new Person();
        Coordinates coordinates = new Coordinates(row, col);

        person.makeTurn(coordinates, person, board);
        board.renderBoard();



        System.out.println("Ход бота");

        InputBot inputBot = new InputBot();
        inputBot.getCoordinates(board);
        int rowBot = inputBot.getRow();
        int colBot = inputBot.getCol();

        Bot bot = new Bot();
        Coordinates coordinatesBot = new Coordinates(rowBot, colBot);

        bot.makeTurn(coordinatesBot, bot, board);
        board.renderBoard();

        String s = board.checkGameState();


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




