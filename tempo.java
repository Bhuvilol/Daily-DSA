import java.util.Arrays;

public class tempo {
    public static int[] intersection(int[] arr1, int[] arr2) {
        int[] result = new int[Math.min(arr1.length, arr2.length)];
        int i = 0, j = 0, k = 0;

        // Iterate through both arrays simultaneously
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                // If the elements are equal, add to the result array
                result[k++] = arr1[i];
                i++;
                j++;
            }
        }

        // Trim the result array to the correct size
        int[] trimmedResult = new int[k];
        System.arraycopy(result, 0, trimmedResult, 0, k);

        return trimmedResult;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        int[] result = intersection(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}
