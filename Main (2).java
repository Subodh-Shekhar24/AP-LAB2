import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns of Matrix A:");
        int rowsA = sc.nextInt();
        int colsA = sc.nextInt();
        int[][] A = new int[rowsA][colsA];
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rows and columns of Matrix B:");
        int rowsB = sc.nextInt();
        int colsB = sc.nextInt();
        int[][] B = new int[rowsB][colsB];
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        try {
            int[][] result = MatrixMultiplication.multiply(A, B);
            System.out.println("Result of Matrix Multiplication:");
            MatrixMultiplication.printMatrix(result);
        } catch (MatrixMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
