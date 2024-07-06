import java.util.*;
public class PassThePillow {
    public static void main(String[] args) {
     int n = 4;
     int time = 5;
        System.out.println(passThePillow(n,time));
    }
    public static  int passThePillow(int n, int time) {
       int completed = time/(n-1);
       int remaining = time % (n-1);
       int ans = 0;
       if(completed % 2 != 0){
           ans = n - remaining;
       }else{
           ans = remaining +1;
       }
       return ans;
    }
}
