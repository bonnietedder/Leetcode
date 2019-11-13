package leetcode;

public class lc441 {
    public static void main(String[] args) {
        lc441 solution = new lc441();
        System.out.println(solution.arrangecoins(8));
    }
    public int arrangecoins(int n){
        int level =1;
        while(n>0){
            n = n - level;
            level++;
        }
        return n==0?level-1:level-2;
    }
}
