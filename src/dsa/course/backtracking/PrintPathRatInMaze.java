package dsa.course.backtracking;

import java.util.Arrays;

public class PrintPathRatInMaze {

    public static void main(String[] args) {
        int a[][] = {
                {1,1,0,1},
                {1,1,1,1},
                {0,0,1,0},
                {1,1,1,1}
        };
        boolean[][] visited = new boolean[a.length][a.length];
        System.out.println(rateInMaze(a,visited,0,0));
        System.out.println("---------------------------------");
        Arrays.stream(visited).forEach(ints -> System.out.println(Arrays.toString(ints)));
    }

    private static boolean rateInMaze(int[][] a,boolean[][] visited, int i, int j) {
        int n = a.length;
        if(i==n || j==n || a[i][j]==0)return false;
        if(i==n-1 && j==n-1) {
            visited[i][j] = true;
            return true;
        }
        visited[i][j] = true;
        if(rateInMaze(a, visited, i+1, j)) return true;
        if(rateInMaze(a, visited,i, j+1)) return true;
        visited[i][j] = false;
        return false;
    }

}
