public class Empty extends Entity{

    public Empty() {
        super(CellState.CELL_STATE_EMPTY);
    }

    @Override
    public int getValue() {
        return 0;
    }
}
