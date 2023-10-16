import shape2d.Circle;
import shape2d.Rectangle;
import shape2d.Square;
import shape2d.twod;
import shape3d.Cube;
import shape3d.Cuboid;
import shape3d.Sphere;
import shape3d.threed;

import java.util.Scanner;

public class ShapeDemo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side of a square:");
        double side = scanner.nextDouble();
        System.out.println("Enter length & breadth of a rectangle:");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        System.out.println("Enter radius of a circle:");
        double radius = scanner.nextDouble();
        System.out.println("Enter height of a cuboid:");
        double height = scanner.nextDouble();

        twod sq = new Square(side);
        twod rect = new Rectangle(length,breadth);
        twod cir = new Circle(radius);

        threed cub = new Cube(side);
        threed cubo = new Cuboid(length,breadth,height);
        threed sph = new Sphere(radius);

        System.out.println("Area of square ="+sq.area());
        System.out.println("Perimeter of square ="+sq.perimeter());
        System.out.println("Area of rectangle ="+rect.area());
        System.out.println("Perimeter of rectangle ="+rect.perimeter());
        System.out.println("Area of circle ="+cir.area());
        System.out.println("Perimeter of circle ="+cir.perimeter());

        System.out.println("Volume of cube ="+cub.volume());
        System.out.println("Surface area of cube="+cub.surfaceArea());
        System.out.println("Volume of cuboid ="+cubo.volume());
        System.out.println("Surface area of cuboid="+cubo.surfaceArea());
        System.out.println("Volume of sphere ="+sph.volume());
        System.out.println("Surface area of sphere="+sph.surfaceArea());
    }
}

