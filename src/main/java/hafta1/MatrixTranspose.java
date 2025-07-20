package hafta1;

public class MatrixTranspose {
    public static void main(String[] args) {
        // Define a fixed 2x3 matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Transpose matrix
        int[][] transpose = new int[3][2];

        // Transpose operation: swap rows with columns
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the original matrix
        System.out.println("Matris:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print the transpose matrix
        System.out.println("Transpoze:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

