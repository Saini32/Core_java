
class Three_Digit{
    public static void main(String args [])
    {
        int no,d1, d2, d3,temp; 
        no = Integer.parseInt (args[0]);
        d3= no% 10; 
        temp = no/10; 
        d2 = temp %10;
        d1 = temp/10; 
        System.out.println("Digit 1 = "+d1 +"\n digit 2 = "+d2 + "\n digit3=" +d3);
    }
}
