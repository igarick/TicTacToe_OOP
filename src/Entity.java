public abstract class Entity {

    // можно ли без имен сделать это все?????????????

    //private final String name;
    private final CellState cellState;

    public Entity(CellState cellState) {
        //this.name = name;
        this.cellState = cellState;
    }

    public void makeTurn(Coordinates coordinates, Entity entity, Board board) {
        board.occupyCell(coordinates, entity);
    }

    public char getSymbol() {
        return cellState.getSymbol();
    }

    public String toString() {
        return cellState.toString();
    }

//    public String getName() {
//        return name;
//    }
}
