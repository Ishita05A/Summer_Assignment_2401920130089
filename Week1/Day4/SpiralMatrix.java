package Week1.Day4;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    static List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m= matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int lc = 0;
        int tr = 0;
        int rc = m-1;
        int br = n-1;
        while(ans.size() < n*m){
            for(int j = lc;j<=rc && ans.size() < n*m;j++){
                ans.add(matrix[tr][j]);
            }
            tr++;
            for(int i = tr;i<=br && ans.size() < n*m;i++){
                ans.add(matrix[i][rc]);
            }
            rc--;
            for(int j = rc;j>=lc && ans.size() < n*m;j--){
                ans.add(matrix[br][j]);
            }
            br--;
            for(int i = br;i>=tr && ans.size() < n*m;i--){
                ans.add( matrix[i][lc]);
            }
            lc++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
    
}
