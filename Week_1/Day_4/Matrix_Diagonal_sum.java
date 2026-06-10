public class Matrix_Diagonal_sum {
    public int diagonalSum(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return 0;
        }

        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i]; // Primary diagonal
            sum += mat[i][n - 1 - i]; // Secondary diagonal
        }

        // If the matrix has an odd dimension, subtract the middle element once
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
    public static void main(String[] args) {
        Matrix_Diagonal_sum solution = new Matrix_Diagonal_sum();
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int result = solution.diagonalSum(mat);
        System.out.println("Diagonal Sum: " + result);
    }
    
}
