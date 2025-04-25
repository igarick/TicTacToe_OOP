public abstract class Entity {
    private final String name;

    public Entity(String name) {
        this.name = name;
    }

    public abstract String getSymbol();


    public String getName() {
        return name;
    }
}
