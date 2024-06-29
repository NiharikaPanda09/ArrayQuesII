import java.util.*;
public class PrintOneSubsequence {
    public static void main(String[] args) {
        int [] arr = {1,2,1};
        int n = arr.length;
        ArrayList<Integer> ds = new ArrayList<>();
        Print(0,ds,0,2,arr,n);
    }

    public static boolean Print(int ind, ArrayList<Integer> ds, int s, int sum, int[] arr, int n) {
        if(ind==n){
            if(s==sum){
                for(int it:ds) {
                    System.out.print(it + " ");
                }
                System.out.println();

               return true;
            }
            return false;
        }
        ds.add(arr[ind]);
        s += arr[ind];

        if(Print(ind + 1, ds, s, sum, arr, n))
            return true;

        ds.remove(ds.size()-1);
        s-= arr[ind];

        if(Print(ind + 1, ds, s, sum, arr, n)){
            return true;
        }

return false;


    }
}

