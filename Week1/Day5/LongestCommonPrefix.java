package Week1.Day5;

import java.util.Arrays;

public class LongestCommonPrefix {
    static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        String first = strs[0];
        String last = strs[n-1];
        int i = 0;
        int j = 0;
        while(first.charAt(i) == last.charAt(j)){
            i++;
            j++;
        }
        return first.substring(0,i);

    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    
}
