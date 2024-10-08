
import java.util.ArrayList;
import java.util.List;

public class printAllPossiblePermutations {

    // public static void permuter(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
    //     if (ds.size() == nums.length) {
    //         ans.add(new ArrayList<>(ds));
    //         return;
    //     }
    //     for (int i = 0; i < nums.length; i++) {
    //         if (!freq[i]) {
    //             freq[i] = true;
    //             ds.add(nums[i]);
    //             permuter(nums, ds, ans, freq);
    //             ds.remove(ds.size() - 1);
    //             freq[i] = false;
    //         }
    //     }
    // }
    // public static List<List<Integer>> permute(int[] nums) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     List<Integer> ds = new ArrayList<>();
    //     boolean[] freq = new boolean[nums.length];
    //     permuter(nums, ds, ans, freq);
    //     return ans;
    // }
    // TC: O(N! * N)
    // SC: O(N) + O(N) + O(N)

    
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuter(nums, 0, result);
        return result;
    }

    private static void permuter(int[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            permuter(nums, start + 1, result);
            swap(nums, start, i);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        List<List<Integer>> result = permute(nums);
        System.out.println(result.toString());
    }
}
