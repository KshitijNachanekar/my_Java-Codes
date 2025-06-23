import java.util.Scanner;
public class SwitchCaseExamp {
    public static void main(String[] args) {
    try (Scanner a = new Scanner(System.in)) {
        System.out.println("Enter any number between 1-3:");
        int num= a.nextInt();
        switch(num){
            case 1 -> System.out.println("Good morning");
            case 2 -> System.out.println("Namaste");
            case 3 -> System.out.println("Bonjuar");
            default -> System.out.println("Invalid");
        }
    }
}
}