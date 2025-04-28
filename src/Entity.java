public abstract class Entity {

    // можно ли без имен сделать это все?????????????

    //private final String name;
    private final Symbol symbol;

    public Entity(Symbol symbol) {
        //this.name = name;
        this.symbol = symbol;
    }

    public void makeTurn(Coordinates coordinates, Entity entity, Board board) {
        board.occupyCell(coordinates, entity);
    }

    public char getSymbol() {
        return symbol.getSymbol();
    }

//    public String getName() {
//        return name;
//    }
}
