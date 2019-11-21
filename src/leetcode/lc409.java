package leetcode;

public class lc409 {

    public int LongestPalindrome(String s){
        int len = 0;
        boolean[] map = new boolean[128];
        for(char c : s.toCharArray()){
            map[c] = !map[c];
            if (!map[c]) {
                len += 2;
            }
        }
        if(len < s.length()) {
            len += 1;
        }
        return len;
    }

    public static void main(String[] args) {
        String s1 = "abccccdd";
        String s2 = "aabbccdd";
        String s3 = "abcdee";
        lc409 solution = new lc409();
        System.out.println(solution.LongestPalindrome(s1));
        System.out.println(solution.LongestPalindrome(s2));
        System.out.println(solution.LongestPalindrome(s3));
    }

}
