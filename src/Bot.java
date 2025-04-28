public class Bot extends Entity{


    public Bot(String name) {
        super(name);
    }

    public void makeTurn(Coordinates coordinates, Entity bot, Board board) {
        board.occupyCell(coordinates, bot);
    }

    @Override
    public String getSymbol() {
        return Symbol.ZERO.getSymbol();
    }

    @Override
    public String toString() {
        return Symbol.ZERO.getSymbol();
    }
}
