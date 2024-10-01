import java.util.*;

public class CheckIfPairsDivByK {
    public static void main(String[] args) {
        int[] arr = {1,2,34,5,10,6,7,8,9};
        int k = 5;
        System.out.println(canArrange(arr,k));
    }
    public static boolean canArrange(int[] arr, int k) {
        int [] freq = new int[k];

        for(int nums:arr){
            int rem = (nums%k+k)%k;
            freq[rem]++;
        }
        if(freq[0] % 2 !=0){
            return false;
        }
        for(int i=1;i<k/2;i++){
          int counterHalf = k-i;
          if(freq[counterHalf] != freq[i]){
              return false;
          }
        }
        return true;
    }
}
