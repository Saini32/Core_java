import java.util.Scanner;

public class nested_ifelse_eg {
    public static void main(String[] args) {
        
        int day;
        Scanner sc=new Scannner(System.in);
        System.out.println("eneter days of number=");
        day=sc.nextInt();
        if (day==1) 
        {
            System.out.println("monday");
            
        } else if(day==2)
        {
            System.out.println("tuesday");
        } 
        else if(day==3)
        {
            System.out.println("wednesday");
        }
        else if(day==4)
        {
            System.out.println("thursday");
        }
        else if (day==5)
        {
            System.out.println("friday");
        }
        else if(day==6)
        {
            System.out.println("saturday");
        }
        else if (day==7)
        {
            System.out.println("sunday");
        }
        else
        {
            System.out.println("invalid!!");
        }

    }
    
}
