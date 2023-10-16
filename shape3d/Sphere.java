package shape3d;

import shape2d.Circle;

public class Sphere extends Circle implements threed
{
    public Sphere()
    {
        super();
    }
    public Sphere(double radius)
    {
        super(radius);
    }
    public double volume()
    {
        return 8*area()*area()/3*perimeter();
    }
    public double surfaceArea()
    {
        return 4*area();
    }
}
