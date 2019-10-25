package leetcode;

public class lc242 {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        lc242 solution =new lc242();
        System.out.println(solution.isAnagram(s,t));
    }

    public boolean isAnagram(String s, String t) {
        int[] cnts = new int[26];
        for(int i=0;i<s.length();i++) {
            cnts[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            cnts[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(cnts[i]!=0) return false;
        }
        return true;
    }
}
