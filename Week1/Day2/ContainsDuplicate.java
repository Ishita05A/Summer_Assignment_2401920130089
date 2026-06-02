package Week1.Day2;

import java.util.HashSet;

public class ContainsDuplicate {
    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> mp = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(mp.contains(nums[i])){
                return true;
            }
            mp.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
    
}
