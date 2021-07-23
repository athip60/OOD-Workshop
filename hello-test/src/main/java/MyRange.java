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
        return this.input.charAt(1) - ASCII_VALUE_OF_1;
    }
    public int getEnd() {
        return this.input.charAt(3) - ASCII_VALUE_OF_1;
    }
}
