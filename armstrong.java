import java.util.Scanner;

class armstrong {
    public static void main(String[] args) {
        int num,sum=0,digit;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number =");
        num=sc.nextInt();
        int temp=num;
        while(num>0)
        {
           digit=num%10;
           sum +=digit*digit*digit;
           num/=10;
        }
        if(temp==sum){
            System.out.println(temp+" is a armstrong");

        }
        else{
            System.out.println(temp+"is not armstrong");

        }
        }

       
}
