package interfaces;

public interface Rectangle {
    int getSquare(int sideA, int sideB);

    default  int getPerimeter(int sideA, int sideB) {
        return 2 * (sideA + sideB);
    }
}
