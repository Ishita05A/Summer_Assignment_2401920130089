package Week2.Day5;

public class LongestPallindromicSubString {
    static int st = 0;
    static int maxLen = 0;
    static void expand(String s,int left, int right){
        while(left>=0 && right <s.length() && s.charAt(left) == s.charAt(right)){
            int len = right - left + 1;
            if(len > maxLen){
                maxLen = len;
                st = left;
            }
            left--;
            right++;
        }
    }
    static String longestPalindrome(String s) {
        for(int i = 0;i<s.length();i++){
            expand(s,i,i);
            expand(s,i,i+1);
        }
        return s.substring(st,st+maxLen);

    }
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
    
}
