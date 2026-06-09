package Week2.Day2;

public class PalindromeString {
    static boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m) return false;

        int[] freq = new int[26];

        for (char ch : s1.toCharArray()) {
            freq[ch - 'a']++;
        }

        int left = 0, right = 0, remaining = n;

        while (right < m) {
            if (freq[s2.charAt(right) - 'a'] > 0) {
                remaining--;
            }

            freq[s2.charAt(right) - 'a']--;
            right++;

            if (remaining == 0) return true;

            if (right - left == n) {
                if (freq[s2.charAt(left) - 'a'] >= 0) {
                    remaining++;
                }

                freq[s2.charAt(left) - 'a']++;
                left++;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String  s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
    
}
