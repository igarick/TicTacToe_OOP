import java.util.Map;
import java.util.Scanner;

public class InputPerson {

    int ROW_COUNT = Main.ROW_COUNT;
    int COL_COUNT = Main.COL_COUNT;

    //Scanner input;

    private int row;
    private int col;
    private final Board board;

  public InputPerson(Board board) {
      this.board = board;
  }


    public void inputCoordinates(Scanner input) {

        while (true) {
            String[] coordinates = input.nextLine().split(" ");

            int row = Integer.parseInt(coordinates[0]);
            int col = Integer.parseInt(coordinates[1]);

            if (isFigureAllowed(row, col)) {
                System.out.println("Некорректное значение! Введите 2 числа");
            } else {
                this.row = row;
                this.col = col;
                return;
            }
        }
    }
    boolean isFigureAllowed(int row, int col) {
        return ((row < 0) || (row >= ROW_COUNT) || (col < 0) || (col >= COL_COUNT));
    }

    public int getRowPerson() {
        return row;
    }

    public int getColPerson() {
        return col;
    }

    boolean isCellEmpty(Board board) {

      return false;
    }

    public Board getBoard() {
        return board;
    }
}

