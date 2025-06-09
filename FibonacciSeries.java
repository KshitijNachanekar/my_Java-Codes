public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci series:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
