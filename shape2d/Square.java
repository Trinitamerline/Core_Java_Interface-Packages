package shape2d;

public class Square implements twod
{
    public double side;
    public Square()
    {
        side = 0;
    }
    public Square(double side)
    {
        this.side=side;
    }
    public double area()
    {
        return side*side;
    }
    public double perimeter()
    {
        return 4*side;
    }
}
