package dsa.course.backtracking;

import java.util.Arrays;

public class NQueenProblemAllSolutions {

    public static void main(String[] args) {
        int n=5;
        int[][] a=new int[n][n];
        isNqueenPossible(a,n, 0);
    }

    private static boolean isNqueenPossible(int[][] a, int n, int row) {
        if(n==row) {
            Arrays.stream(a).forEach(ints -> System.out.println(Arrays.toString(ints)));
            System.out.println("---------------------------------");
            return false;
        }

        for (int col = 0; col < n; col++) {
            if(isSafe(a,n,col, row)){
                a[row][col]=1;
                if(isNqueenPossible(a,n, row+1)){
                    return true;
                }
                a[row][col]=0;

            }

        }

        return false;
    }

    private static boolean isSafe(int[][] a, int n, int col, int row) {

        for (int i = 0; i < n; i++) {
            if(a[i][col]==1) return false;
        }
        for (int i = row, j =col; i >=0 && j>=0 ; i--, j--) {
            if (a[i][j]==1) return false;
        }
        for (int i = row, j =col; i >=0 && j<n ; i--, j++) {
            if (a[i][j]==1) return false;
        }
        return true;
    }
}
