package Week1.Day1;

public class RemoveDuplicate {
    static  int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[k++] = nums[i];
            }
        }
        return k;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
    
}
