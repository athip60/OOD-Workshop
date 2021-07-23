public class MyRange {
    public static final int ASCII_VALUE_OF_1 = 48;
    private  final String input;
    public  MyRange(String input) {
        this.input = input;
    }

    public boolean isStartWithInclude() {
        return this.input.startsWith("[");
    }
    public boolean isEndWithInclude() {
        return this.input.endsWith("]");
    }
    public int getStart() {
        if (isStartWithInclude()) {
            return this.input.charAt(1) - ASCII_VALUE_OF_1;
        }
        return this.input.charAt(1) - (ASCII_VALUE_OF_1 - 1);
    }
    public int getEnd() {
        if (isEndWithInclude()) {
            return this.input.charAt(3) - ASCII_VALUE_OF_1;
        }
        return this.input.charAt(3) - (ASCII_VALUE_OF_1 + 1);
    }

    public String getResult() {
        String result = "";
        for (int i = getStart(); i <= getEnd(); i++) {
            result += String.valueOf(i);
            if (i != getEnd()) {
                result += ",";
            }
        }
        return result;
    }
}
