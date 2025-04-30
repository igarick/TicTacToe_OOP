import java.util.Scanner;

public class Game {

    private final Scanner scanner;

    public Game(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {

        Board board = new Board();

        while (true) {

            System.out.println("Введите 2е цифры через пробел: 1я - ряд, 2я - колонка");

            InputPerson input = new InputPerson();
            input.inputCellCoordinates(scanner, board);
            Coordinates coordinates = new Coordinates(input.getRow(), input.getCol());

            Player person = new Person();
            person.makeTurn(coordinates, board);
            board.renderBoard();

            GameState state = board.checkGameState();
            if (state != GameState.NOT_FINISHED) {
                System.out.println(state.getState());
                break;
            }

            System.out.println("Ход бота");

            InputBot inputBot = new InputBot();
            inputBot.getRandomCellEmptyCoordinates(board);
            Coordinates coordinatesBot = new Coordinates(inputBot.getRow(), inputBot.getCol());

            Player bot = new Bot();
            bot.makeTurn(coordinatesBot, board);
            board.renderBoard();

            state = board.checkGameState();
            if (state != GameState.NOT_FINISHED) {
                System.out.println(state.getState());
                break;
            }
        }
    }
}
