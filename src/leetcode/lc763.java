package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class lc763 {

    public static void main(String[] args) {
        lc763 solution = new lc763();
        String S = "ababcbacadefegdehijhklij";
        System.out.println(solution.partitionLabels(S));
    }

    public List<Integer> partitionLabels(String S) {
        int len = S.length();
        HashMap<Character, Integer> map = new HashMap<>();  //记录每一个字符的最后位置

        char c ;
        for(int i = 0; i < len; i++){
            c = S.charAt(i);
            map.put(c, i);
        }
        //再遍历一边，将同一个字母划分为一段
        List<Integer> list = new ArrayList<>();
        int maxIdx = -1;
        while(true){
            int index = maxIdx + 1;
            maxIdx = map.get(S.charAt(index));
            for(int i = index; i <= maxIdx; i++){
                c = S.charAt(i);
                if(map.get(c) > maxIdx){
                    maxIdx = map.get(c);
                }
            }
            list.add(maxIdx - index + 1);
            if(maxIdx == len - 1){
                break;
            }
        }
        return list;
    }
}
