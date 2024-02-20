package second;

public class Rectangle implements interfaces.Rectangle {

    private final String backgroundColor;
    private final String borderColor;

    Rectangle(String backgroundColor, String borderColor) {
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public int getSquare(int sideA, int sideB) {
        return sideA * sideB;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}
