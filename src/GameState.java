public enum GameState {
    GAME_STATE_X_WON("Х победили!"),
    GAME_STATE_O_WON("O победили!"),
    GAME_STATE_DRAW("Ничья"),
    GAME_STATE_NOT_FINISHED("Игра не закончена");

    private final String state;

    GameState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
