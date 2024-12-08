public class Four_Digit{
    public static void main(String[] args) {
        int no = Integer.parseInt(args[0]);

        int digit1 = no / 1000;          // Thousands place
        int digit2 = (no / 100) % 10;   // Hundreds place
        int digit3 = (no / 10) % 10;    // Tens place
        int digit4 = no % 10;           // Ones place

        System.out.println("Digit 1 = " + digit1);
        System.out.println("Digit 2 = " + digit2);
        System.out.println("Digit 3 = " + digit3);
        System.out.println("Digit 4 = " + digit4);
    }
}
