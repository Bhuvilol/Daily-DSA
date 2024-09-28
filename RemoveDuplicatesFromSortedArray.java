public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 40, 50};
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        for (int k = 0; k <= i+1; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
