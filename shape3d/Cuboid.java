package shape3d;

import shape2d.Rectangle;

public class Cuboid extends Rectangle implements threed
{
    double height;
    public Cuboid()
    {
        super();
        height=0;
    }
    public Cuboid(double length,double breadth,double height)
    {
        super(length,breadth);
        this.height = height;
    }
    public double volume()
    {
        return area()*height;
    }
    public double surfaceArea()
    {
        return perimeter()*2*height;
    }
}
