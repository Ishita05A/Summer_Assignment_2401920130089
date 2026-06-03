package Week1.Day3;

public class ContainerWithMostWater {
    static int maxArea(int[] height) {
        int max_dist = Integer.MIN_VALUE;
        int n = height.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            int min = Math.min(height[i],height[j]);
            max_dist = Math.max(max_dist,min*(j-i));
            if(height[i]<height[j]){
                i++;
            }
            else j--;
        }
        return max_dist;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    
}
