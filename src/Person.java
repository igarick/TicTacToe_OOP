public class Person extends Entity{

    public Person () {
        super(CellState.CELL_STATE_CROSS);
    }

    @Override
    public int getValue() {
        return 1;
    }

//    @Override
//    public void makeTurn(Coordinates coordinates, Entity person, Board board) {
//        board.occupyCell(coordinates, person);
//    }
//
//    @Override
//    public char getSymbol() {
//        return Symbol.CROSS.getSymbol();
//    }

//    @Override
//    public String toString() {
//        return CellState.CELL_STATE_CROSS.toString();
//    }
}
