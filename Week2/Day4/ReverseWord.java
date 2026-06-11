package Week2.Day4;

public class ReverseWord {
    static String reverse(String s){
        char[] word = s.toCharArray();
        int i = 0;
        int j = word.length-1;
        while(i<j){
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }
    static String reverseWords(String s) {
        int j = 0;
        int i = 0;
        int n = s.length();
        StringBuilder st = new StringBuilder();
        while(j<n){
            while( j<n && s.charAt(j) != ' ' ) j++;
            if(j>=n) break;
            String word = reverse(s.substring(i,j));
            st.append(word);
            st.append(" ");
            j++;
            i = j;
            word = "";
        }
        String word = reverse(s.substring(i,j));
        st.append(word);
        return st.toString();
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
        
    }
    
}
