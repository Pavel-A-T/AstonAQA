package second;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("black", "blue");
        Triangle triangle = new Triangle("white", "yellow");
        Rectangle rectangle = new Rectangle("red", "purple");
        System.out.println("BackgroundColor circle is " + circle.getBackgroundColor());
        System.out.println("BackgroundColor triangle is " + triangle.getBackgroundColor());
        System.out.println("BackgroundColor rectangle is " + rectangle.getBackgroundColor());
        System.out.println("BorderColor circle is " + circle.getBorderColor());
        System.out.println("BorderColor triangle is " + triangle.getBorderColor());
        System.out.println("BorderColor rectangle is " + rectangle.getBorderColor());
        System.out.println("Perimeter circle is " + circle.getPerimeter(25));
        System.out.println("Square circle is " + circle.getSquare(25));
        System.out.println("Perimeter triangle is " + triangle.getPerimeter(5, 7, 11));
        System.out.println("Square triangle is " + triangle.getSquare(5, 7, 11));
        System.out.println("Perimeter rectangle is " + rectangle.getPerimeter(5, 12));
        System.out.println("Square rectangle is " + rectangle.getSquare(5, 12));
    }
}
