package leetcode;

public class lc540 {
    public static void main(String[] args) {
        lc540 solution = new lc540();
        int[] nums1 = new int[]{1,1,2,3,3,4,4,8,8};
        int[] nums2 = new int[]{3,3,7,7,10,11,11,21,21};
        System.out.println(solution.singleelement(nums1));
        System.out.println(solution.singleelement(nums2));
    }
    public int singleelement(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = (left + right)/2;
            if (nums[mid] == nums[mid +1]){
                if (mid%2 == 0){
                    left = mid +2;
                }
                else
                    right = mid -1;
            }
            if (nums[mid] == nums[mid -1]){
                if (mid%2 == 1){
                    left = mid +1;
                }
                else
                    right = mid -2;
            }
            else return nums[mid];
        }
        return nums[left];
    }
}
