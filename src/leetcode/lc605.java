package leetcode;

public class lc605 {
    public static void main(String[] args) {
        int[] flowerBed1 = new int[]{1,0,0,0,1};
        int[] flowerBed2 = new int[]{0,0,1,0,0};
        lc605 solution = new lc605();
        System.out.println(solution.canPlaceFlowers(flowerBed1,1));

        System.out.println(solution.canPlaceFlowers(flowerBed1,2));

        System.out.println(solution.canPlaceFlowers(flowerBed2,1));

        System.out.println(solution.canPlaceFlowers(flowerBed2,2));
    }

    public boolean canPlaceFlowers(int[] flowerBed, int n){
        int count = 0, i=0;
        while (i < flowerBed.length){
            // 注意 || 先判断前项
            if (flowerBed[i] == 0 && (i==0 || flowerBed[i-1] == 0) && (i==flowerBed.length - 1 || flowerBed[i+1] == 0)){
                flowerBed[i] = 1;
                count ++;
            }
            i++;
        }
        return count >= n;
    }
}


