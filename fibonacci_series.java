import java.util.Scanner;

class fibonacci_series {
    public static void main(String[] args) {
        int n,F=0,s=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number =");
        n=sc.nextInt();
        System.out.println("Fibonacci series=");
        for(int i=1;i<=n;i++)
        {
            System.out.println(F+" ");
            int c=F+s;
            F=s;
            s=c;
        }
       
    }
}
