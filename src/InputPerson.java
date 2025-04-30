import java.util.Scanner;

public class InputPerson {

    private int row;
    private int col;

    public void inputCellCoordinates(Scanner scanner, Board board) {

        while (true) {
            String[] input = scanner.nextLine().trim().split(" ");

            if (input.length != 2) {
                System.out.println("Некорректное значение! Введите 2е цифры через пробел");
                continue;
            }

           // try {
                int row = Integer.parseInt(input[0]);
                int col = Integer.parseInt(input[1]);

                if (isOutOfBoards(row, col)) {
                    System.out.println("Некорректное значение! Введите 2е цифры от 0 до 2");
                } else if (board.isCellOccupied(row, col)) {
                    System.out.println("Ячейка занята! Введите другие координаты");
                } else {
                    this.row = row;
                    this.col = col;
                    return;
                }
//            } catch (NumberFormatException e) {
//                throw new RuntimeException("Некорректное значение! Введите 2е цифры от 0 до 2");
            //}
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

