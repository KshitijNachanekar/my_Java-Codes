public class LargestNumInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest number in the array is: " + largest);
    }
}
