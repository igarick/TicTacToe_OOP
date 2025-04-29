import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Board {

    public static final int ROW_COUNT = 3;
    public static final int COL_COUNT = 3;
    public static final int TOTAL_CELLS = ROW_COUNT * COL_COUNT;

    private final Map<Coordinates, Entity> board = new HashMap<>();

    public void occupyCell(Coordinates coordinates, Entity entity) {
        board.put(coordinates, entity);
    }

//    public void fillInBoard() {
//        Entity empty = new Person(); // один общий объект
//
//        for (int row = 0; row < ROW_COUNT; row++) {
//            for (int col = 0; col < COL_COUNT; col++) {
//                Coordinates coordinates = new Coordinates(row, col);
//                board.put(coordinates, empty);
//            }
//        }
//    }

    public void renderBoard() {
        for (int row = 0; row < ROW_COUNT; row++) {
            for (int col = 0; col < COL_COUNT; col++) {
                Coordinates coordinates = new Coordinates(row, col);
                Entity entity = board.get(coordinates);
                if (entity != null) {
                    System.out.print("[" + entity.getSymbol() + "]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }
    public boolean isOccupied (int row, int col){
        Coordinates cellCoordinates = new Coordinates(row, col);
            return board.containsKey(cellCoordinates);
    }

    public String checkGameState() {
        ArrayList<Integer> sums = new ArrayList<>();

        for (int row = 0; row < ROW_COUNT; row++) {
            int rowSum = 0;
            for (int col = 0; col < COL_COUNT; col++) {
                Coordinates coordinates = new Coordinates(row, col);
                rowSum += calculateNumValue(coordinates);
            }
            sums.add(rowSum);
        }
        return "";
    }

    public boolean areAllCellsTaken() {
        return board.size() == TOTAL_CELLS;
    }

    //
    public int calculateNumValue(Coordinates coordinates) {
        Entity entity = board.get(coordinates);
        if (entity instanceof Person) {
            return 1;
        } else if (entity instanceof Bot) {
            return -1;
        } else {
            return 0;
        }
    }


}
