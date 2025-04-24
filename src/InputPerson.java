import java.util.Scanner;

public class InputPerson {

    int ROW_COUNT = Main.ROW_COUNT;
    int COL_COUNT = Main.COL_COUNT;

    //Scanner input;

    private int row;
    private int col;

  public InputPerson() {
//      this.input = input;
//      this.x = x;
//      this.y = y;

  }


    public void inputCoordinates(Scanner input) {
        //System.out.println("Введите 2е цифры через пробел: 1я - ряд, 2я - колонка");
        while (true) {
            String[] coordinates = input.next().split(" ");

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


//    public void setX(int x) {
//        this.x = x;
//    }

    public int getRowPerson() {
        return row;
    }

//    public void setY(int y) {
//        this.y = y;
//    }

    public int getColPerson() {
        return col;
    }

}

