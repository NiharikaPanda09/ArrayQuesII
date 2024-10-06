import java.util.*;
public class SentenceSimilarityIII {
    public static void main(String[] args) {
            String str1 = "My name is Haley";
            String str2 = "My Haley";
        System.out.println(areSentencesSimilar(str1,str2));
    }

    // Helper function to split a sentence into words
    private static String[] splitWords(String sentence) {
        return sentence.split(" ");
    }

    public static  boolean areSentencesSimilar(String sentence1, String sentence2) {
        // Split both sentences into arrays of words
        String[] words1 = splitWords(sentence1);
        String[] words2 = splitWords(sentence2);

        if(words1.length < words2.length){
            String[] temp = words1;
            words1 = words2;
            words2 = temp;
        }
        int start = 0;
        int end =0;
        int n1 = words1.length;
        int n2 = words2.length;
        while(start < n2 && words1[start].equals(words2[start])){
            start++;
        }
        while(end < n2 && words1[n1-end-1].equals(words2[n2-end-1])){
            end++;
        }
        return start+end >= n2;
    }
}
