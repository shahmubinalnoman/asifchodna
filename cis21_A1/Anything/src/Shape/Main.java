package Shape;

public class Main {
    static void main() {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(5,7);

        circle.display();
        rectangle.display();
        triangle.display();
    }


}
