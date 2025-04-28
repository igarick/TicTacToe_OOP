public enum Symbol {
    CROSS("X"),
    ZERO("O");

    private final String symbol;

    Symbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

//    @Override
//    public String toString() {
//        return symbol;
//    }
}
