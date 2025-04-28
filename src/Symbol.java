public enum Symbol {
    CROSS('X'),
    ZERO('O');

    private final char symbol;

    Symbol(char symbol) {
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
