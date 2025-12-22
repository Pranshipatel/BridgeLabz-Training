public class MatrixOperations {

    // Method to create a random matrix
    public static int[][] createMatrix(int rows, int cols) {
        int matrix[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
				
                matrix[i][j] = (int)(Math.random() * 10); 
				
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrix(int[][] A, int[][] B) {
        int result[][] = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
				
                result[i][j] = A[i][j] + B[i][j];
				
            }
        }
		
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrix(int[][] A, int[][] B) {
        int result[][] = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }


    // Method to multiply two matrices
    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int result[][] = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
					
                    result[i][j] += A[i][k] * B[k][j];
					
                }
            }
        }
		
        return result;
    }
	

    // Method to display matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
				
                System.out.print(matrix[i][j] + "\t");
				
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create matrices
        int A[][] = createMatrix(2, 3);
        int B[][] = createMatrix(2, 3);
        int C[][] = createMatrix(3, 2);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nAddition (A + B):");
        displayMatrix(addMatrix(A, B));

        System.out.println("\nSubtraction (A - B):");
        displayMatrix(subtractMatrix(A, B));

        System.out.println("\nMatrix C:");
        displayMatrix(C);

        System.out.println("\nMultiplication (A x C):");
        displayMatrix(multiplyMatrix(A, C));
		
    }
}
