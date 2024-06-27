import java.util.*;
public class PrintSubsequence {
    public static void main(String[] args) {
        int [] arr = {3,1,2};
        int n = arr.length;
        ArrayList<Integer> ds = new ArrayList<>();
        printF(0,ds,arr,n);

    }
    public static void printF(int ind,List<Integer> ds, int[] arr,int n){
        if( ind == n){
            for(int it:ds){
                System.out.print(it + " ");
            }
            System.out.println();
            return;
        }
        ds.add(arr[ind]);
        printF(ind+1,ds,arr,n);
        ds.remove(ds.size()-1);
        printF(ind+1,ds,arr,n);
    }
}
