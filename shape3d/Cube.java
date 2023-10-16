package shape3d;

import shape2d.Square;

public class Cube extends Square implements threed
{
    public Cube()
    {
        super();
    }
    public Cube(double side)
    {
        super(side);
    }
    public double volume()
    {
        return area()*side;
    }
    public double surfaceArea()
    {
        return 6*area();
    }
}
