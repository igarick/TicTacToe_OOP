public enum Values {
    ROW_COUNT(3),
    COL_COUNT(3),
    TOTAL_CELLS(ROW_COUNT.value * COL_COUNT.value);

    private final int value;

    Values(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
