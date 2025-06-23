import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DynamicStarPatternWithBlanks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        System.out.print("Enter number of blank positions: ");
        int blankCount = scanner.nextInt();

        Set<String> blankPositions = new HashSet<>();
        for (int k = 0; k < blankCount; k++) {
            System.out.print("Enter blank position " + (k + 1) + " (row column): ");
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            blankPositions.add(r + "," + c);
        }

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (blankPositions.contains(i + "," + j)) {
                    System.out.print("  "); 
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
