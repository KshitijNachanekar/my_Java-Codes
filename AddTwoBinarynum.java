public class AddTwoBinarynum {
    public static void main(String[] args) {
        String b1 = "1010";
        String b2 = "1101";

        int num1 = Integer.parseInt(b1, 2);
        int num2 = Integer.parseInt(b2, 2);

        int sum = num1 + num2;

        String result = Integer.toBinaryString(sum);

        System.out.println("First binary: " + b1);
        System.out.println("Second binary: " + b2);
        System.out.println("Sum (binary): " + result);
    }
}