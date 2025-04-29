import java.util.Scanner;

public class InputPerson {

    private int row;
    private int col;

    public void inputCoordinates(Scanner input, Board board) {

        while (true) {
            String[] coordinates = input.nextLine().split(" ");

            if (coordinates.length < 2) {
                System.out.println("Некорректное значение! Введите 2 числа");
                continue;
            }

            try {
                int row = Integer.parseInt(coordinates[0]);
                int col = Integer.parseInt(coordinates[1]);

                if (isOutOfBoards(row, col)) {
                    System.out.println("Некорректное значение! Введите 2 числа");
                } else if (board.isOccupied(row, col)) {
                    System.out.println("Ячейка занята! Введите другие координаты");
                } else {
                    this.row = row;
                    this.col = col;
                    return;
                }
            } catch (NumberFormatException e) {
                throw new RuntimeException("Некорректное значение! Введите 2 числа");
            }


        }
    }
    boolean isOutOfBoards(int row, int col) {
        return ((row < 0) || (row >= Board.ROW_COUNT) || (col < 0) || (col >= Board.COL_COUNT));
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}

