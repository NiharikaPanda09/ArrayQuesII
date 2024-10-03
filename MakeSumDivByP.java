import java.util.*;
public class MakeSumDivByP {
    public static void main(String[] args) {
    int[] arr  = {3,1,4,2};
    int p = 6;
        System.out.println(minSubarray(arr,p));
    }
    public static  int minSubarray(int[] nums, int p) {
          long totalSum =0;
          for(int num:nums){
              totalSum += num;
          }
            int rem = (int) (totalSum%p);
          if(rem ==0) return 0;

          HashMap<Integer,Integer> map = new HashMap<>();
          map.put(0,-1);
          long prefixSum = 0;
          int minLength = nums.length;

          for(int i=0;i<nums.length;i++){
              prefixSum += nums[i];
              int currMod = (int) (prefixSum%p);
              int targetMod = (currMod-rem+p)%p;
              if(map.containsKey(targetMod)){
                  minLength = Math.min(minLength,i-map.get(targetMod));
              }
              map.put(currMod,i);


          }
          return minLength== nums.length ?-1:minLength;
    }
}
