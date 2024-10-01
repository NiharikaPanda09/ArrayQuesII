import java.util.*;
public class ExcelProblem {
    public static void main(String[] args) {
   int colnum = 28;
        System.out.println(convertToTitle(colnum));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while(columnNumber >0){
            columnNumber--;
            int rem = columnNumber % 26;
            char curr = (char)('A' + rem );
            res.insert(0,curr);
            columnNumber /= 26;
            System.err.println(res);
        }
        return res.toString();
    }
}
