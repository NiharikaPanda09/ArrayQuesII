import java.util.*;
public class MaximumNumInRange {
    public static void main(String[] args) {
      int [] arr = {1,6,5};
      int n = 5;
      int max = 6;
      System.out.println(maxCount(arr,n,max));
    }
    public static int maxCount(int[] banned, int n, int maxSum) {
      Set<Integer> set = new HashSet<>();
      for(int num:banned){
          set.add(num);
      }
      int currSum = 0;
      int cnt = 0;
      for(int i=1;i<=n;i++){
          if(!set.contains(i) &&  currSum+i <= maxSum){
              currSum += i;
              cnt++;
          }
      }
      return  cnt;
    }
}
