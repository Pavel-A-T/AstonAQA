package interfaces;

public interface Triangle {
    double getSquare(int sideA, int sideB, int sideC);

    default int getPerimeter(int sideA, int sideB, int sideC) {
        return sideA + sideB + sideC;
    }
}
