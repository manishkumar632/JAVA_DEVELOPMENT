package DYNAMIC_PROGRAMMING;

import java.util.HashMap;

public class Sum_Target {
    static boolean findPair(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if(target == 0) return true;
        for (int a : arr) {
            int complement = target - a;
            if (map.containsKey(complement)) {
                return true;
            }
            map.put(a, a);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 8;
        boolean found = findPair(arr, target);
        System.out.println("Found a pair: " + found);
    }
}
