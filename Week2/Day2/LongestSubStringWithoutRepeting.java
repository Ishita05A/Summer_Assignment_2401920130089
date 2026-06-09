package Week2.Day2;

public class LongestSubStringWithoutRepeting {
    static int lengthOfLongestSubstring(String s) {
        char[] freq = new char[128];
        int max = 0;
        int st = 0;
        int end = 0;
        int n = s.length();
        while(end < n){
            char ch = s.charAt(end);
            freq[ch]++;
            if(freq[ch] > 1){
                while( st < end && s.charAt(st) != ch){
                    freq[s.charAt(st)]--;
                    st++;
                }
                freq[s.charAt(st)]--;
                st++;
            }
            max = Math.max(max,end-st+1);
            end++;
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
        
    }
}
