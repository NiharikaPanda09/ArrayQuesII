import java.util.*;
public class RansomNote {
    public static void main(String[] args) {
        String r = "aa";
        String m = "aab";
        System.out.println(canConstruct(r,m));

    }
    public static boolean canConstruct(String ransomNote, String magazine) {
           int[] count = new int[26];
           for(char ch:magazine.toCharArray()) {
               count[ch - 'a']++;
           }

               for (char ch : ransomNote.toCharArray()) {
                   count[ch - 'a']--;
                   if (count[ch - 'a'] < 0) {
                       return false;
                   }
               }

           return true;
    }
}
