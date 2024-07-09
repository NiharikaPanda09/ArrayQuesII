import java.util.*;
public class AverageWaitingTime {
    public static void main(String[] args) {
           int[][] arr = {{1,2},{2,5},{4,5}};
           double res = averageWaitingTime(arr);
        System.out.println(res);
    }
    public static double averageWaitingTime(int[][] customers) {

       long t = 0;
        long total = 0;

        for (int[] customer : customers) {
            int arrival = customer[0];
            int order = customer[1];

            if (t > arrival) {
                total += t - arrival;
            } else {
                t = arrival;
            }
            total += order;
            t += order;
        }

        return (double) total / customers.length;
    }
}
