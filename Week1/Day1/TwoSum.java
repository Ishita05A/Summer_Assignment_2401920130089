
package Week1.Day1;

import java.util.HashMap;

public class TwoSum {
    
     static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        
        for(int i = 0;i<n;i++){
            if(mp.containsKey(target - nums[i])){
                return new int[] {i, mp.get(target - nums[i])};
            }
            mp.put(nums[i],i);
        }
        return new int[] {-1};

    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] ans = twoSum(arr,9);
        System.out.println(ans[0]+" "+ans[ans.length-1]);
    }sbhad
    
}