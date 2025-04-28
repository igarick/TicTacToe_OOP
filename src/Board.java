import java.util.HashMap;
import java.util.Map;

public class Board {

    private final Map<Coordinates, Entity> board = new HashMap<>();

    public void occupyCell(Coordinates coordinates, Entity entity) {
        board.put(coordinates, entity);
    }

    public void renderBoard() {
        for (int row = 0; row < Values.ROW_COUNT.getValue(); row++) {
            for (int col = 0; col < Values.COL_COUNT.getValue(); col++) {
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

    public boolean isFull() {
        return board.size() == Values.TOTAL_CELLS.getValue();
    }


}
