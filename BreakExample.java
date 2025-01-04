import java.util.*;

class BreakExample {
    public static void main(String args[]) {
        int n, total = 0, i;
        Scanner sc = new Scanner(System.in);

        for (i = 1; i <= 5; i++) {
            System.out.print("Enter a number: ");
            n = sc.nextInt();

            if (n > 99) {
                System.out.println("Number is greater than 99, exiting loop.");
                break; // Exit the loop when the number is greater than 99
            }
            total += n;
        }
        System.out.println("Sum = " + total);
    }
}
