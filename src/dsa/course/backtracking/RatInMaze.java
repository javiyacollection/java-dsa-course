package dsa.course.backtracking;

public class RatInMaze {
    public static void main(String[] args) {
    int a[][] = {
            {1,1,0,1},
            {1,1,1,1},
            {0,0,1,0},
            {1,1,0,1}
    };
        System.out.println(rateInMaze(a,0,0));
    }

    private static boolean rateInMaze(int[][] a, int i, int j) {
        int n = a.length;
        if(i==n || j==n || a[i][j]==0)return false;
        if(i==n-1 && j==n-1) return true;
         if(rateInMaze(a, i+1, j)) return true;
         if(rateInMaze(a, i, j+1)) return true;
         return false;
    }


}
