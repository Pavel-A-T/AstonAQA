package second;

public class Triangle implements interfaces.Triangle {

    private final String backgroundColor;
    private final String borderColor;

    Triangle(String backgroundColor, String borderColor) {
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getSquare(int sideA, int sideB, int sideC) {
        double p = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}
