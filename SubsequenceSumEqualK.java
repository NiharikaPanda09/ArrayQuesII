import java.util.*;
public class SubsequenceSumEqualK {
    public static void main(String[] args) {
          int [] arr = {1,2,1};
        int n = arr.length;
        ArrayList<Integer> ds = new ArrayList<>();
        PrintS(0,ds,0,2,arr,n);
    }
       public static void PrintS(int ind,List<Integer> ds,int s,int sum,int[] arr,int n){
        if(ind == n){
            if(s == sum) {
                for (int it : ds) {
                    System.out.print(it + " ");
                }
                System.out.println();

            }
            return;
        }
        ds.add(arr[ind]);
        s += arr[ind];
        PrintS(ind+1,ds,s,sum,arr,n);
        ds.remove(ds.size()-1);
        s -= arr[ind];
        PrintS(ind+1,ds,s,sum,arr,n);
       }
}
