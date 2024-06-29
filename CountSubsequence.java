import java.util.*;
public class CountSubsequence {
    public static void main(String[] args) {
        int [] arr = {1,2,1};
        int sum = 2;
        int n = arr.length;
        System.out.println(Count(0,0,sum,arr,n));
    }
    public static int Count(int ind,int s,int sum,int [] arr,int n){
        if(ind == n){
            if(s == sum){
                return 1;
            }else{
                return 0;
            }
        }
        s+= arr[ind];
        int l = Count(ind+1,s,sum,arr,n);
        s-= arr[ind];
        int r = Count(ind+1,s,sum,arr,n);

        return l+r;

    }

}
