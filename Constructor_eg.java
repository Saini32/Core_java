import java.util.Scanner;
class Circle
{
    private double r,area;
    Circle() //default constructor
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a radius=");
        r=sc.nextDouble();
    }
    Circle(Circle x)  //copy constructor
    {
        r=x.r;

    }
    void cal()
    {
        area=3.14*r*r;

    }
    void display()
    {
        System.out.println("Area= "+area);
    }
    }

class Constructor_eg{
    public static void main(String args[])
    {
        Circle c=new Circle();
        Circle c1=new Circle(c);
        c1.cal();
        c1.display();

    }
}