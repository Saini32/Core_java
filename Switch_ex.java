import java.util.Scanner;
class Switch_ex {
    public static void main (String args[])
    {
        int no;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number for days=");
        no=sc.nextInt();
        switch(no)
        {
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("thursday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;
            default:
            System.out.println("invalid!!");
        }
    }

}
