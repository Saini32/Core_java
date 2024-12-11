import java.util.Scanner;
class Switch_colours{
    public static void main (String args[])
    {
        char colour;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a cahracter of colours=");
        colour=sc.next().charAt(0);
        switch(colour)
        {
            case 'r':
            System.out.println("red");
            break;
            case 'R' :
            System.out.println("Red");
            break;
            case 'g':
            System.out.println("green");
            break;
            case 'G':
            System.out.println("Green");
            break;
            case 'b':
            System.out.println("blue");
            break;
            case 'B':
            System.out.println("Blue");
            break;
            default:
            System.out.println("invalid!!");
        }
    }

    
}
