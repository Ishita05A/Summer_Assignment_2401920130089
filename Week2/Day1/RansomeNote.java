package Week2.Day1;

public class RansomeNote {
    static boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for(int i = 0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            freq[ch-'a']++;
        }
        for(int i = 0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            if(freq[ch-'a'] == 0) return false;
            freq[ch-'a']--;
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
    }
    
}
