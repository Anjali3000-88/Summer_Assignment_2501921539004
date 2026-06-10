public class Reshape_the_matrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return mat;
        }

        int originalRows = mat.length;
        int originalCols = mat[0].length;

        if (originalRows * originalCols != r * c) {
            return mat; // Cannot reshape, return original matrix
        }

        int[][] reshapedMatrix = new int[r][c];
        int rowIndex = 0;
        int colIndex = 0;

        for (int i = 0; i < originalRows; i++) {
            for (int j = 0; j < originalCols; j++) {
                reshapedMatrix[rowIndex][colIndex] = mat[i][j];
                colIndex++;

                if (colIndex == c) {
                    colIndex = 0;
                    rowIndex++;
                }
            }
        }

        return reshapedMatrix;
    }
    public static void main(String[] args) {
        Reshape_the_matrix solution = new Reshape_the_matrix();
        int[][] mat = {
            {1, 2},
            {3, 4}
        };
        int r = 1;
        int c = 4;
        int[][] result = solution.matrixReshape(mat, r, c);
        System.out.println("Reshaped Matrix:");
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
}
