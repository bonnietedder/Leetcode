package leetcode;

public class lc205 {
    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "bed";
        String s3 = "add";
        lc205 solution = new lc205();
        System.out.println(solution.isIsomorphic(s1,s2));
        System.out.println(solution.isIsomorphic(s1,s3));
    }
    public boolean isIsomorphic(String s , String t){
        //char类型作为索引， 对应char标为相同的值，对比相同的值
        int[] s1 = new int[256];
        int[] s2 = new int[256];
        for (int i=0;i<s.length();i++){
            if (s1[s.charAt(i)] != s2[t.charAt(i)]){
                return false;
            }
            s1[s.charAt(i)] = i+1;
            s2[t.charAt(i)] = i+1;
        }
        return true;
    }
}
