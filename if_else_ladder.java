import java.util.Scanner;

public class if_else_ladder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();

        // Switch case to check the range
        switch (marks / 10) {
            case 10: // For marks = 100
            case 9:
                System.out.println("Distinction");
                break;
            case 8:
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
            default:
                if (marks >= 0 && marks < 40) {
                    System.out.println("Fail");
                } else {
                    System.out.println("Invalid marks entered.");
                }
        }

        scanner.close();
    }
}
