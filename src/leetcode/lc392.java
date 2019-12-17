package leetcode;

public class lc392 {
    public static void main(String[] args) {
        lc392 solution =  new lc392();
        String s1 = "abc";
        String s2 = "axc";
        String t = "ahbgdc";
        System.out.println(solution.isSubsequence(s1,t));
        System.out.println(solution.isSubsequence(s2,t));
    }
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0, tIndex = 0;
        for (;sIndex < s.length();sIndex++,tIndex++){
            tIndex = t.indexOf(s.charAt(sIndex),tIndex);
            if(tIndex == -1)
                return false;
        }
        return true;
    }
}
