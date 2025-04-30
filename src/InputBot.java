import java.util.Random;

public class InputBot {
    private int row;
    private int col;

    private final Random random = new Random();

    public void getRandomCellEmptyCoordinates(Board board) {
        while (true) {
            row = random.nextInt(Board.ROW_COUNT);
            col = random.nextInt(Board.COL_COUNT);

            if (!board.isCellOccupied(row, col)) {
                break;
            }
        }
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
