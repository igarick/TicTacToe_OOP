import java.util.Random;

public class InputBot {
    Random random = new Random();

    private final int row = random.nextInt(0,4);
    private final int col = random.nextInt(0, 4);

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
