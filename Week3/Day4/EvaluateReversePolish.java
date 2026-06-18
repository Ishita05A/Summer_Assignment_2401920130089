package Week3.Day4;

import java.util.Stack;

public class EvaluateReversePolish {
    static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<tokens.length;i++){
            String ch = tokens[i];
            if(ch.equals("+") || ch.equals("-") || ch.equals("/") || ch.equals("*") ){
                int s2 = st.pop();
                int s1 = st.pop();
                if(ch.equals("+")){
                    st.push(s1+s2);
                }
                else if(ch.equals("-")){
                    st.push(s1-s2);
                }
                else if(ch.equals("/")){
                    st.push(s1/s2);
                }
                else if(ch.equals("*")){
                    st.push(s1*s2);
                }
            }
            else{
                int num = Integer.parseInt(ch);
                st.push(num);
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};

        System.out.println(evalRPN(tokens));

    }
    
}
