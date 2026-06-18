package Week3.Day4;

import java.util.Stack;

public class DailyTemperatures {
    static void display(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1;i>=0;i--){
            
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i] ){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek()-i;
            }
            
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] ans = dailyTemperatures(temperatures);
        display(ans);
    }
    
}
