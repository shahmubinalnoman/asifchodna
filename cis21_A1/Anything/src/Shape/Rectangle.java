package Shape;

public class Rectangle extends Shape{
    double base;
    double height;

    Rectangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {

        return 0.5 * base * height;
    }
}
