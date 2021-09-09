public class Circle  implements Shape
{
    String name;
    Double radius;
    public Circle(String name, double radius)
    {
        this.name= name;
        this.radius= radius;
    }


  public String getName()
    {
        return name;
    }

public Double getArea()
    {

        return Math.pow(radius, 2) * Math.PI;

    }
}
