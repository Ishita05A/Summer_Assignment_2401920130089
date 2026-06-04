package Week1.Day4;

public class ReshapeMatrix {
    static void display(int[][] mat){
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if(n*m != r*c) return mat;
        int x = 0;
        int y = 0;
        int[][] ans = new int[r][c];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                ans[x][y++] = mat[i][j];
                if(y == c){
                    y = 0;
                    x++;
                } 
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int[][] ans = matrixReshape(mat, 1, 4);
        display(ans);
    }
}
