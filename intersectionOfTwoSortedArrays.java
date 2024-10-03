import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class intersectionOfTwoSortedArrays {
    public static int[] intersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {2, 2};
        int[] result = intersection(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}
