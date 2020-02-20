package leetcode;

public class lc169 {
    public static void main(String[] args) {
        int[] num = new int[]{2,2,1,1,1,2,2};
        lc169 solution = new lc169();
        System.out.println(solution.majorityElement(num));
    }

    public int majorityElement(int[] nums) {
        int majorityCount = nums.length/2;

        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }
            if (count > majorityCount) {
                return num;
            }

        }
        return majorityCount;
    }

}
