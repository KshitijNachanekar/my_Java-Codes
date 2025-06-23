import java.util.Scanner;

class ScannerExample {
    public static void main(String[] args) {
        try (Scanner a = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int b = a.nextInt();  // Take user input
            
            for (int i = 0; i <= b; i++) {
                if (i < b) {
                    System.out.println(i + " is less than " + b);
                } else {
                    System.out.println(i + " is equal to " + b);
                }
            }
        }
    }
}
