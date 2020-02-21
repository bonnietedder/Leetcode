package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc229 {

    public static void main(String[] args) {

        int[] nums = new int[]{1,1,1,3,3,2,2,2};
        lc229 solution = new lc229();
        System.out.println(solution.majorityElement(nums));
    }


        public List<Integer> majorityElement(int[] nums) {
            int cnt1 = 0,cnt2 = 0,a1 = 0,a2 = 0;
            for(int num : nums){

                if(a1 == num){
                    cnt1 += 1;continue;
                }
                if(a2 == num){
                    cnt2 += 1;continue;
                }
                if(cnt1 == 0 && a2!= num){
                    a1 = num;
                    cnt1 += 1;
                    continue;
                }
                if(cnt2 == 0 && a1!= num){
                    a2 = num;
                    cnt2 += 1;
                    continue;
                }

                cnt1--;
                cnt2--;

            }

            int c1 = 0,c2 = 0;
            for(int num :nums){
                if(num == a1){
                    c1 += 1;
                }
                if(num == a2){
                    c2 += 1;
                }
            }

            //System.out.println(a1);
            //System.out.println(a2);

            List<Integer> list = new ArrayList<>();
            if(c1 > nums.length/3){
                list.add(a1);
            }
            if(a1 != a2){
                if(c2 > nums.length/3){
                    list.add(a2);
                }
            }

            return list;
        }
    }

