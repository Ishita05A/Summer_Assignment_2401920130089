package Week1.Day2;

public class FindMaxAverage {
    static double findMaxAverage(int[] nums, int k) {
       
        int n = nums.length;
         if(k>n) return -1;
        double sum = 0;
        for(int i = 0;i<k;i++){
            sum+=nums[i];
        }
        double max = sum;
        for(int i = k;i<n;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            max = Math.max(max,sum);
        }
        return max/k;
    }
    public static void main(String[] args) {
        int[] arr= {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(arr, 4));
    }
    
}
