package leetcode;

import java.util.Arrays;
import java.util.Comparator;
//import java.util.Comparator;

public class lc452 {

    public static void main(String[] args) {
        int[][] balls = new int[][]{{10,16}, {2,8}, {1,6}, {7,12}};
        for (int i = 0; i < balls.length; i++)
        System.out.println(Arrays.toString(balls[i]));
        lc452 solution = new lc452();
        System.out.println(solution.findMinArrowShots(balls));
    }
    
    public int findMinArrowShots(int[][] points) {
        if(points.length < 2) return points.length;
        //Arrays.sort(points,(a,b) -> (a[1] - b[1]));
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] != o2[1])
                    return o1[1] - o2[1];
                else
                    return o1[0] - o2[0];
            }
        });

        int curPos = points[0][1];
        int minArrow = 1;
        for (int i = 1; i < points.length; i++) {
            if(points[i][0] <= curPos) {
                continue;
            }
            curPos = points[i][1];
            minArrow++;
        }
        return minArrow;
    }
}
