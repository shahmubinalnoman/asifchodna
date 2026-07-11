package Shape;

public class Triangle extends Shape{
    double height;
    double width;

    Triangle(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    @Override
    double area() {
        return height * width;
    }
}
