public class SecondLargestNumArray {
    public static void main(String[] args) {
        int[] arr = {11, 23, 55, 54, 33};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number (all elements might be equal).");
        } else {
            System.out.println("Second largest number is: " + secondLargest);
        }
    }
}
