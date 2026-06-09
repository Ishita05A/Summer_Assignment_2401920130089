package Week2.Day2;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {
    static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int n = s.length();
        int m = p.length();

        if (m > n) return ans;

        int[] freq = new int[26];

        for (char ch : p.toCharArray()) {
            freq[ch - 'a']++;
        }

        int left = 0, right = 0, remaining = m;

        while (right < n) {
            if (freq[s.charAt(right) - 'a'] > 0) {
                remaining--;
            }

            freq[s.charAt(right) - 'a']--;
            right++;

            if (remaining == 0) {
                ans.add(left);
            }

            if (right - left == m) {
                if (freq[s.charAt(left) - 'a'] >= 0) {
                    remaining++;
                }

                freq[s.charAt(left) - 'a']++;
                left++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
    }
    
}
