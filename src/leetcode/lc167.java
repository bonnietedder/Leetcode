package leetcode;

import java.util.Arrays;

public class lc167 {
    public static void main(String[] args) {
        lc167 solution = new lc167();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 26;
        System.out.println(Arrays.toString(solution.twoSum(nums,target)));
    }

    public int[] twoSum(int[] numbers, int target){
        int start = 0, end = numbers.length - 1;
        while (start < end){
            if (numbers[start] + numbers[end] == target){
                return  new int[]{start + 1, end + 1};
            }
            else if(numbers[start] + numbers[end] < target){
                start ++;
            }
            else
                end --;
        }
        return null;
    }
}
