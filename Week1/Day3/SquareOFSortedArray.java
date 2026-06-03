package Week1.Day3;

public class SquareOFSortedArray {
    static void display(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int n = nums.length;
        int[] res = new int[n];
        int k = n-1;
        while(i<=j){
            int leftSq = nums[i]*nums[i];
           int  rightSq = nums[j]*nums[j];
            if(leftSq >= rightSq){
                res[k--] = leftSq;
                i++;
            }
            else{
                res[k--] = rightSq;
                j--;
            }
        }
            
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        int[] ans = sortedSquares(arr);
        display(ans);
    }
    
}
