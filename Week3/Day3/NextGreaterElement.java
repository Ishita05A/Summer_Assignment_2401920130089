package Week3.Day3;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    static void display(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            int val = st.isEmpty() ? -1 : st.peek();
            st.push(nums2[i]);
            mp.put(nums2[i], val);
        }
        int m = nums1.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            ans[i] = mp.get(nums1[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };

        int[] ans = nextGreaterElement(nums1, nums2);

        display(ans);
    }

}
