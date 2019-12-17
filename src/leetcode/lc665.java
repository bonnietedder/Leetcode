package leetcode;

//定义一个非递减数列的： 对于数组中所有的 i (1 <= i < n)，满足 array[i] <= array[i + 1]

public class lc665 {

    public static void main(String[] args) {
        lc665 solution = new lc665();
        int[] num1 = new int[]{4,2,3};
        int[] num2 = new int[]{4,2,1};
        System.out.println(solution.checkPossibility(num1));
        System.out.println(solution.checkPossibility(num2));
    }

    //前一个元素y大于后一个元素z时，
    //如果y的前元素x不存在，让y=z即可,
    //当x存在且x>z，就让z=y，否则让y=z

    public boolean checkPossibility(int[] nums) {
        if (nums.length < 3)
            return true;
        int count = 0;
        for(int i =0; i < nums.length - 1; i++ ){
            if (nums[i] > nums[i+1]){
                count++;
                if (count > 1)
                    return false;
                if (i > 0 && nums[i-1] > nums[i+1])
                    nums[i+1] = nums[i];
                else
                    nums[i] = nums[i+1];
            }
        }
        return true;
    }
}
