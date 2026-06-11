package Week2.Day4;
import java.util.*;
public class GenerateParentheses {
    static void helper(List<String> ans, int open, int close, String st,int n){
        if(st.length() == 2*n){
            ans.add(st);
            return;
        }
        if(open < n ) helper(ans, open+1, close, st+"(", n);
        if(close<n && close < open) helper(ans, open, close+1, st+")", n);
   }

    static List<String> generate(int n){
        List<String> ans = new ArrayList<>();
        helper(ans, 0, 0, "", n);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(generate(3));
    }
    
}
