import java.util.*;
public class GetRankTransform {
    public static void main(String[] args) {
         int[] arr = {40,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    public static  int[] arrayRankTransform(int[] arr) {
        //sorted map
        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int val:arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int rank = 1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            map.put(entry.getKey(),rank);
            rank++;
        }
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}
