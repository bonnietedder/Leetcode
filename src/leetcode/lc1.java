package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class lc1 {
    public static void main(String[] args) {
        lc1 solution = new lc1();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 26;
        System.out.println(Arrays.toString(solution.twoSum(nums,target)));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            if(map.containsKey(target - nums[i]))
                return new int[] {map.get(target - nums[i]),i};
            else
                map.put(nums[i], i);
        }
        return null;
    }
}
