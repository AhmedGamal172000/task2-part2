public class main
{

    public static void display_shape_type(Shape S1)
    {
        System.out.print("shape name is " + S1.getName());
        System.out.println(" & shape area is " + S1.getArea());
    }

    public static void main (String [] args)
    {


        Shape c1 = new Circle("c1" , 3.2);
       Shape s1 = new Square("s1" , 4);

         display_shape_type(c1);
         display_shape_type(s1);

    }



}
