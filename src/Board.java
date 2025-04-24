import java.util.HashMap;
import java.util.Map;

public class Board {

    int ROW_COUNT = Main.ROW_COUNT;
    int COL_COUNT = Main.COL_COUNT;

    Map<Coordinates, Player> board = new HashMap<>();

    public void addPlayer(Coordinates coordinates, Player player) {
        board.put(coordinates, player);
    }

    public void renderBoard() {
        for (int row = 0; row < ROW_COUNT; row++) {
            for (int col = 0; col < COL_COUNT; col++) {
                Coordinates coordinates = new Coordinates(row, col);
                Entity entity = board.get(coordinates);
                if (entity != null) {
                    System.out.print(" " + entity.getSymbol() + " ");
                } else {
                    System.out.print("|   |");
                }

            }
            System.out.println();
        }
    }





    //    private final static int ROW_COUNT = 3;
//    private final static int COL_COUNT = 3;

//*--------------------------------------------------
//    int ROW_COUNT = Main.ROW_COUNT;
//    int COL_COUNT = Main.COL_COUNT;
//
//    public void printBoard(int coordinateRow, int coordinateCol) {

//    }
    //--------------------------------------------------
}
