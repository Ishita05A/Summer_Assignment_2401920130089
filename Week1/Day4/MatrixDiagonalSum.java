package Week1.Day4;

public class MatrixDiagonalSum {
    
    static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
            int k = n-i-1;
            sum+=mat[i][i];
            if(i != k) sum+=mat[i][k];
        }
        return sum;

    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
    
}
