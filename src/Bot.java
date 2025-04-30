public class Bot extends Player {

    public Bot() {
        super(CellState.ZERO);
    }

    @Override
    public int getValue() {
        return -1;
    }

    @Override
    public void makeTurn(Coordinates coordinates, Board board) {
        board.placePlayer(coordinates, this);
    }

//    @Override
//    public char getSymbol() {
//        return Symbol.ZERO.getSymbol();
//    }

//    @Override
//    public String toString() {
//        return Symbol.ZERO.getSymbol();
//    }
}
