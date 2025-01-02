import java.util.Scanner;

class prime_number {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int num = s.nextInt();

        int i, m = 0, flag = 0;
        m = num / 2; // Only check up to half of the number

        for (i = 2; i <= m; i++) {
            if (num % i == 0) { // Check divisibility
                System.out.println("Number is not prime");
                flag = 1;
                break;
            }
        }

        if (flag == 0 && num > 1) { // Numbers greater than 1 and not divisible
            System.out.println("Number is prime");
        } else if (num <= 1) { // Handle numbers <= 1
            System.out.println("Number is not prime");
        }
    }
}
