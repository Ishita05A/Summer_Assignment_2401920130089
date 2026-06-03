package Week1.Day3;

public class MoveZeroInEnd {
    static void moveZeroes(int[] arr) {
        int n = arr.length;
        int j = -1;
        for(int i = 0;i<n;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1) return;
        for(int i = j+1;i<n;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
       
        
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        
    }
    
}
