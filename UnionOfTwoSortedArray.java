import java.util.*;

public class UnionOfTwoSortedArray {
    //Brute Force
    // public static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2) {
    //     int n = arr1.length;
    //     ArrayList<Integer> Union = new ArrayList<>();
    //     int m = arr2.length;
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     for(int i = 0; i < n; i++) {
    //         map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
    //     }
    //     for(int i = 0; i < m; i++) {
    //         map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
    //     }
    //     for(int i : map.keySet()) {
    //         Union.add(i);
    //     }

    //     return Union;
    // }

    //Optimal
    public static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> Union = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < n && j < m) {
            if(arr1[i] <= arr2[j]) {
                if(Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++;
            }
            else {
                if(Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                }
                j++;
            }
        }
        while(i < n) {
            if(Union.get(Union.size() - 1) != arr1[i]) {
                Union.add(arr1[i]);
            }
            i++;
        }
        while(j < m) {
            if(Union.get(Union.size() - 1) != arr2[j]) {
                Union.add(arr2[j]);
            }
            j++;
        }
        return Union;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,4,5};
        int[] arr2 = {2,3,4,5,6};
        ArrayList<Integer> Union = FindUnion(arr1, arr2);
        System.out.println(Union);
    }
}
