import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {
        int num,rev=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number =");
        num=sc.nextInt();
        int temp=num;
        while(num!=0)
        {
           rem=num%10;
           rev=rev*10+rem;
           num/=10;
        }
        if(temp==rev){
            System.out.println(temp+" is a palindrome");

        }
        else{
            System.out.println(temp+"is not palindrome");

        }
        }

       
}
