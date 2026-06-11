package Week2.Day4;

import java.util.Stack;

public class DecodeString {
    static String decodeString(String s) {
        int num = 0;
        StringBuilder curr = new StringBuilder();
        Stack<Integer> numSt = new Stack<>();
        Stack<StringBuilder> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num*10 + (ch-'0');
            }
            else if(ch == '['){
                numSt.push(num);
                st.push(curr);
                num = 0;
                curr = new StringBuilder();
            }
            else if(ch == ']'){
                StringBuilder prev = st.pop();
                int repeat = numSt.pop();
                for(int i = 1;i<=repeat;i++){
                    prev.append(curr);
                }
                curr = prev;
            }
            else curr.append(ch);
        }
        return curr.toString();
        
    }
    public static void main(String[] args) {
         String s = "3[a]2[bc]";
         System.out.println(decodeString(s));
    }
    
}
