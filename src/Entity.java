public abstract class Entity {

    // можно ли без имен сделать это все?????????????

    private final String name;

    public Entity(String name) {
        this.name = name;
    }

    public abstract void makeTurn(Coordinates coordinates, Entity entity, Board board);

    public abstract String getSymbol();

    public String getName() {
        return name;
    }
}
