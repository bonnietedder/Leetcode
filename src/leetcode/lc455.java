package leetcode;

import java.util.Arrays;

public class lc455 {
    public static void main(String[] args) {
        lc455 solution = new lc455();
        int[] children = new int[]{4,3,2,1};
        int[] cookies = new int[]{1,3,5,7};
        System.out.println(solution.findContentChildren(children,cookies));
    }

    public int findContentChildren (int[] children,int[] cookies){
        Arrays.sort(children);
        Arrays.sort(cookies);
        int i =0, j= 0;
        while(i<children.length && j<cookies.length){
            if(children[i] <= cookies[j]) ++i;
            j++;
        }
        return i;
    }

}
