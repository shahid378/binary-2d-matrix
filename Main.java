import java.util.*;

public class Main {
    public static void modifyMatrix(int mat[][], int R, int C) {
        int[] rowMat = new int[R];
        int i, j;
        for (i = 0; i < R; i++) {
            rowMat[i] = 0;
        }
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                if (mat[i][j] == 1) {
                    rowMat[i] = 1;
                }
            }
        }
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                if (rowMat[i] == 1) {
                    mat[i][j] = 1;
                }
            }
        }

    }

    public static void printMat(int[][] mat, int R, int C) {
        int i, j;
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] arr = new int[row][col];
            int i, j;
            for (i = 0; i < row; i++) {
                for (j = 0; j < col; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            modifyMatrix(arr, row, col);
            printMat(arr, row, col);
        }
        sc.close();
        test--;

    }
}
