public class Person extends Entity{

    public Person (String name) {
        super(name);
    }

    @Override
    public void makeTurn(Coordinates coordinates, Entity person, Board board) {
        board.occupyCell(coordinates, person);
    }

    public String getSymbol() {
        return Symbol.CROSS.getSymbol();
    }

    @Override
    public String toString() {
        return Symbol.CROSS.getSymbol();
    }
}
