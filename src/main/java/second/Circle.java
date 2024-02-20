package second;

public class Circle implements interfaces.Circle {

    private final String backgroundColor;
    private final String borderColor;

    Circle(String backgroundColor, String borderColor) {
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getSquare(int redius) {
        return Math.PI * redius * redius;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}
