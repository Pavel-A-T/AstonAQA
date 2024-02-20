package interfaces;

public interface Circle {
    double getSquare(int redius);

    default int getPerimeter(int radius) {
        return (int) Math.PI * radius;
    }
}
