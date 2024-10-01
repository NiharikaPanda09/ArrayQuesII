import java.util.*;
public class ConsOdd {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5,7,9};
        System.out.println(threeConsecutiveOdds(arr));

    }
    public static boolean threeConsecutiveOdds(int[] arr) {
        int ct =0;
        for (int j : arr) {
            if (j % 2 != 0) {
                ct++;
                if (ct == 3) {
                    return true;
                }
            } else {
                ct = 0;
            }
        }
        return false;

    }
}
