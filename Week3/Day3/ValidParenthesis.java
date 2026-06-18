package Week3.Day3;

import java.util.Stack;

public class ValidParenthesis {
    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else if(st.size() == 0) return false;
            else if(ch == ')' && st.peek() == '(' ){
                st.pop();
            }
            else if(ch == '}' && st.peek() == '{'){
                st.pop();
            }
            else if(ch == ']' && st.peek() == '['){
                st.pop();
            }
            else return false;
        }
        return st.size() == 0;
    }
    public static void main(String[] args) {
        System.out.println(isValid("(()){}"));
    }
    
}
