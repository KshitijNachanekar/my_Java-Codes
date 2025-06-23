public class Starpatternwithblanks {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if ((i == 2 && j == 2) || (i == 3 && j == 3)) {
                    System.out.print("  "); 
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
