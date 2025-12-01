package easy.hashmap;

        // LeetCode #1 - Two Sum
        // Approach: HashMap
        // Time: O(n)

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum{

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String [] args){
        TwoSum sum= new TwoSum();

        int [] nums ={1,2,3,4,5,6,7,8,9};
        int target=6;
        int [] result=sum.twoSum(nums,6);
        if (result.length == 2) {
            System.out.println("Indices found: " + Arrays.toString(result));
            System.out.println("Numbers: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No solution found.");
        }
    }
}