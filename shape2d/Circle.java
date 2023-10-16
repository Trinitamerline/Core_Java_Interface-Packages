package shape2d;

public class Circle implements twod
{
    public double radius;
    public Circle()
    {
        radius = 0;
    }
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double area()
    {
        return 3.14*radius*radius;
    }
    public double perimeter()
    {
        return 2*3.14*radius;
    }
}
