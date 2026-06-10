package Week2.Day3;

public class CheckSubSequence {
    public static boolean isSubsequence(String s, String t) {
        int i =0;
        int j =0;
        while(i<s.length() && j< t.length()){
            if(s.charAt(i)==t.charAt(j)){
            i++;
            }
            j++;
        }
        
        return i== s.length();
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 ="ahbgdc";
        System.out.println(isSubsequence(s1, s2));
    }
    
}
