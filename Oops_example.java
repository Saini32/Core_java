import java.util.*;
class Arimethic{
    int a,b,sum=0;
    public void add(int x,int y){
        a=x;
        b=y;
        sum=a+b;
        System.out.println("Add:"+sum);
    }
    public void sub(){
        sum=a-b;
        System.out.println("Sub:"+sum);
    }
    public int mul(int p,int r){
        a=p;
        b=r;
        sum=a*b;
        return sum;
    }
    public int div() {
        if (b != 0) {
            sum= a / b;
            return sum;
        } else {
            System.out.println("Error: Division by zero!");
            return 0;
}
}
class Oops_example {
    public static void main(String[] args) {
        int x,y,p,r,res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        x=sc.nextInt();
        y=sc.nextInt();
        p=x;
        r=y;
        Arimethic a=new Arimethic();
        a.add(x,y);
        a.sub();
        res=a.mul(p,r);
        System.out.println("Mul:"+res);
        res=a.div();
        System.out.println("div:"+res);
    }
}
