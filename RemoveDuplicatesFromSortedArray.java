import java.util.HashSet;

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
    // public static int removeDuplicates(int[] arr) {
    //     HashSet<Integer> set = new HashSet<>();
    //     for (int i = 0; i < arr.length; i++) {
    //         set.add(arr[i]);
    //     }
    //     int k  = set.size();
    //     int j = 0;
    //     for (int i : set) {
    //         arr[j++] = i;
    //     }
    //     return k;
    // }
}
