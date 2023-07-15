package oop_project.homework.hw2;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrix1 = inputIntMatrix(sc);
        int [][] matrix2 = inputIntMatrix(sc);
        int [][] mul = multiply(matrix1, matrix2);
        System.out.println(haveSameDimension(matrix1, matrix2));
        print(matrix1);
        System.out.println();
        print(matrix2);
        System.out.println();
        print(mul);
    }

    public static int [][] inputIntMatrix(Scanner sc) {
        System.out.print("Enter number of row: ");
        int m = sc.nextInt();
        System.out.print("Enter number of column: ");
        int n = sc.nextInt();
        int [][] matrix = new int [m][n];
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static double [][] inputDoubleMaxtrix(Scanner sc) {
        System.out.print("Enter number of row: ");
        int m = sc.nextInt();
        System.out.print("Enter number of column: ");
        int n = sc.nextInt();
        double [][] matrix = new double [m][n];
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = sc.nextDouble();
            }
        }
        return matrix;
    }


    public static void print(int [][] matrix) {
        if (matrix == null) return;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }


    public static void print(double [][] matrix) {
        if (matrix == null) return;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }


    public static boolean haveSameDimension(int [][] matrix1, int [][] matrix2) {
        if (matrix1 == null || matrix2 == null) return false;
        if ((matrix1.length == matrix2.length) 
            && (matrix1[0].length == matrix2[0].length)) {
            return true;
        }
        return false;
    }

    public static boolean haveSameDimension(double [][] matrix1, double [][] matrix2) {
        if (matrix1 == null || matrix2 == null) return false;
        if ((matrix1.length == matrix2.length) && (matrix1[0].length == matrix2[0].length)) {
            return true;
        }
        return false;
    }

    public static int [][] add(int [][] matrix1, int [][] matrix2) {
        if (matrix1 == null || matrix2 == null) return null;
        if (haveSameDimension(matrix1,matrix2)) {
            int [][] temp = new int [matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    temp[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return temp;
        }
        return null;
    }

    public static double [][] add(double [][] matrix1 , double [][] matrix2) {
        if (matrix1 == null || matrix2 == null) return null;
        if (haveSameDimension(matrix1, matrix2)) {
            double [][] temp = new double [matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    temp[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return temp;
        }
        return null;
    }

    public static int [][] subtract(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) return null;
        if (haveSameDimension(matrix1, matrix2)) {
            int [][] temp = new int[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    temp[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            return temp;
        }
        return null;
    }

    public static double [][] subtract(double [][] matrix1, double [][] matrix2) {
        if (matrix1 == null || matrix2 == null) return null;
        if(haveSameDimension(matrix1,matrix2)){
            double [][] temp= new double[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    temp[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            return temp;
        }
        return null;
    }
    
    public static int [][] multiply(int [][] matrix1, int [][] matrix2) {
        if (matrix1 == null || matrix2 == null) return null;
        if (matrix1[0].length == matrix2.length) {
            int temp [][] = new int [matrix1.length][matrix2[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    temp[i][j] = 0;
                    for (int k = 0; k < matrix1[0].length; k++) {
                        temp[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return temp;
        }
        return null;
    }

    public static double[][] multiply(double [][] matrix1, double [][] matrix2) {
        if (matrix1 == null || matrix2 == null) return null;
        if (matrix1[0].length == matrix2.length) {
            double temp [][] = new double[matrix1.length][matrix2[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    temp[i][j] = 0;
                    for (int k = 0; k < matrix1[0].length; k++) {
                        temp[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return temp;
        }
        return null;
    }
}

