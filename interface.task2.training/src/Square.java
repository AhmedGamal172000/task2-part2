public class Square  implements Shape
{
    String name;
    Double L;
    public Square(String name, double L)
    {
        this.name = name;
        this.L = L;
    }


    public String getName()
    {
        return name;
    }

    public Double getArea()
    {
        return L*L;
    }
}

