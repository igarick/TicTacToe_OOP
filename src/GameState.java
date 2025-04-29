public enum GameState {
    X_WON("Х победили!"),
    O_WON("O победили!"),
    DRAW("Ничья"),
    NOT_FINISHED("Игра не закончена");

    private final String state;

    GameState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
