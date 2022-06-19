package dsa.course.recursion;

public class FindPathsInGrid {
    public static void main(String[] args) {
        System.out.println("Total no. of paths : " + findPathsInGrid(3,4));
    }

    private static int findPathsInGrid(int r, int c) {
        if(r==1 || c==1) return 1;
        return findPathsInGrid(r-1,c ) + findPathsInGrid(r, c-1);
    }
}
