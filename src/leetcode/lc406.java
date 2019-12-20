package leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class lc406 {
    public static void main(String[] args) {
        lc406 solution = new lc406();
        int[][] people = new int[][]{{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        int[][] ans = solution.reconstructQueue(people);
        for (int i = 0;i < ans.length;i++)
            System.out.println(Arrays.toString(ans[i]));
    }

    public int[][] reconstructQueue(int[][] people) {

        // [7,0], [7,1], [6,1], [5,0], [5,2], [4,4]
        // 再一个一个插入。
        // [7,0]
        // [7,0], [7,1]
        // [7,0], [6,1], [7,1]
        // [5,0], [7,0], [6,1], [7,1]
        // [5,0], [7,0], [5,2], [6,1], [7,1]
        // [5,0], [7,0], [5,2], [6,1], [4,4], [7,1]

        Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);

        LinkedList<int[]> list = new LinkedList<>();
        for (int[] i : people) {
            list.add(i[1], i);
        }
        //return list.toArray(new int[list.size()][2]);
        return list.toArray(people);
    }
}
