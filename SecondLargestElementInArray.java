public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] > largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest element in the array is: " + secondLargest);
    }
}
