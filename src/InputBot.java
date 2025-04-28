import java.util.Random;

public class InputBot {
    Random random = new Random();

    private int row;
    private int col;

    public void getCoordinates(Board board) {
        boolean isOccupied = true;
        while (isOccupied) {
            row = random.nextInt(0, 4);
            col = random.nextInt(0, 4);

            isOccupied = board.isOccupied(row, col);
        }
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
