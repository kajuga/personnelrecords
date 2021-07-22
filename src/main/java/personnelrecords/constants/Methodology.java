package personnelrecords.constants;

public enum Methodology {
    METHODOLOGY_FIRST,
    METHODOLOGY_SECOND,
    METHODOLOGY_THIRD;


    public static Methodology fromString(String value) {
        if (value != null) {
            for (Methodology methodology : Methodology.values()) {
                if (value.equalsIgnoreCase(methodology.name())) {
                    return methodology;
                }
            }
        }
        throw new IllegalArgumentException("No such value");
    }
}