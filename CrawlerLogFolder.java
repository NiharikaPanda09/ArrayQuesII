import java.util.*;
public class CrawlerLogFolder {
    public static void main(String[] args) {
     String [] log = {"d1/","d2/","../","d21/","./"};
     int res = minOperations(log);
        System.out.println(res);
    }
    public static int minOperations(String[] logs) {
    int res=0;
    for(String log : logs){
        if(log.equals("./") ){
            continue;
        } else if (log.equals("../")) {
            res = Math.max(0,res-1);
        }else{
            res += 1;
        }
    }




    return res;
    }
}
