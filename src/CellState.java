public enum CellState {
    CELL_STATE_EMPTY(' '),
    CELL_STATE_CROSS('X'),
    CELL_STATE_ZERO('O');

    private final char symbol;

    CellState(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

//    @Override
//    public String toString() {
//        return symbol;
//    }
}
