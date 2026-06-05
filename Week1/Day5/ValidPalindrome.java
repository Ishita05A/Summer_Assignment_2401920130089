package Week1.Day5;

public class ValidPalindrome {
    static boolean isUpperCase(char ch){
        if(ch >= 65 && ch <= 90) return true;
        return false;
    }
    static boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder st = new StringBuilder();
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if((ch >=65 && ch<=90 )|| (ch>=97 && ch <= 122) || (ch >= 48 && ch <= 57)){
                st.append(ch);
            }
        }
        int i = 0;
        int j = st.length() -1;
        while(i<j){
            char ch = st.charAt(i);
            char sh = st.charAt(j);
            if(isUpperCase(ch)){
                ch = (char)(ch+32);
            }
            if(isUpperCase(sh)){
                sh = (char)(sh+32);
            }
            if(ch != sh) return false; 
            i++;
            j--;
        }
        return true;

    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    
}
