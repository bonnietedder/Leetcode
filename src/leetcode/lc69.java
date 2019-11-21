package leetcode;

public class lc69 {
    public static void main(String[] args) {
        lc69 solution = new lc69();
        System.out.println(solution.Sqrt(4));
        System.out.println(solution.Sqrt(8));
        System.out.println(solution.Sqrt(9));
    }
    public int Sqrt(int x){
        if(x <= 1) return x;
        int left = 1, right = x;
        while(left <= right){
            int mid = (left + right)/2;
            int sqrt = x / mid;
            if (sqrt == mid) return sqrt;
            else if (sqrt > mid) left = mid +1;
            else right = mid - 1;
        }
        return right;
    }
}
