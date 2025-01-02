import java.util.Scanner;

public class switch_case_eg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();

        // Determine class using switch
        switch (marks / 10) {
            case 10: // For marks = 100
                System.out.println("Distinction");
                break;
            case 9:
                System.out.println("Distinction");
                break;
            case 8:
                System.out.println("Distinction");
                break;
            case 7:
                System.out.println("Distinction");
                break;
            case 6:
                System.out.println("First Class");
                break;
            case 5:
                System.out.println("Second Class");
                break;
            case 4:
                System.out.println("Pass Class");
                break;
            case 3: // For marks = 30-39
            case 2: // For marks = 20-29
            case 1: // For marks = 10-19
            case 0: // For marks = 0-9
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid marks entered.");
        }

        scanner.close();
    }
}
