public abstract class Player {

    private final CellState symbol;

    public Player(CellState symbol) {
        this.symbol = symbol;
    }

    public abstract void makeTurn(Coordinates coordinates, Board board);

    public abstract int getValue();

    public char getSymbol() {
        return symbol.getSymbol();
    }

    public String toString() {
        return symbol.toString();
    }
}
