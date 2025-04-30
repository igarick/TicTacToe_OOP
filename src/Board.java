import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Board {
    public static final int ROW_COUNT = 3;
    public static final int COL_COUNT = 3;
    public static final int TOTAL_CELLS = ROW_COUNT * COL_COUNT;

    private final Map<Coordinates, Player> board = new HashMap<>();

    public void placePlayer(Coordinates coordinates, Player player) {
        board.put(coordinates, player);
    }

    public void renderBoard() {
        for (int row = 0; row < ROW_COUNT; row++) {
            for (int col = 0; col < COL_COUNT; col++) {
                Player player = board.get(new Coordinates(row, col));
                if (player != null) {
                    System.out.print("[" + player.getSymbol() + "]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }
    public boolean isCellOccupied(int row, int col){
        return board.containsKey(new Coordinates(row, col));
    }

    public boolean areAllCellsTaken() {
        return board.size() == TOTAL_CELLS;
    }

    public GameState checkGameState() {
        ArrayList<Integer> sums = new ArrayList<>();

        // iterate rows
        for (int row = 0; row < ROW_COUNT; row++) {
            int rowSum = 0;
            for (int col = 0; col < COL_COUNT; col++) {
                rowSum += calculateNumValue(new Coordinates(row, col));
            }
            sums.add(rowSum);
        }

        //iterate colomns
        for (int col = 0; col < COL_COUNT; col++) {
            int colSum = 0;
            for (int row = 0; row < ROW_COUNT; row++) {
                colSum += calculateNumValue(new Coordinates(row, col));
            }
            sums.add(colSum);
        }

        // diagonal from top-left to bottom-right
        int leftDiagonalSum = 0;
            for (int i = 0; i < ROW_COUNT; i++) {
                leftDiagonalSum += calculateNumValue(new Coordinates(i, i));
            }
            sums.add(leftDiagonalSum);

        // diagonal from top-right to bottom-left
        int rightDiagonalSum = 0;
        for (int i = 0; i < ROW_COUNT; i++) {
            rightDiagonalSum += calculateNumValue(new Coordinates(i, (ROW_COUNT - 1) - i));
        }
            sums.add(rightDiagonalSum);

        if (sums.contains(3)) {
            return GameState.X_WON;
        } else if (sums.contains(-3)) {
            return GameState.O_WON;
        } else if (areAllCellsTaken()) {
            return GameState.DRAW;
        } else {
            return GameState.NOT_FINISHED;
        }
    }

    public int calculateNumValue(Coordinates coordinates) {
        Player player = board.get(coordinates);

        if (player != null) {
            return player.getValue();
        } else {
            return 0;
        }

//        if (entity instanceof Person) {
//            return 1;
//        } else if (entity instanceof Bot) {
//            return -1;
//        } else {
//            return 0;
//        }
    }
}
