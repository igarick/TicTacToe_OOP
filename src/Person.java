public class Person extends Player {

    public Person () {
        super(CellState.CROSS);
    }

    @Override
    public int getValue() {
        return 1;
    }

    @Override
    public void makeTurn(Coordinates coordinates, Board board) {
        board.placePlayer(coordinates, this);
    }
}
