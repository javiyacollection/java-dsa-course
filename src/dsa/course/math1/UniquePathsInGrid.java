package dsa.course.math1;

public class UniquePathsInGrid {
    public static void main(String[] args) {
        System.out.println(findUniquePaths(5,3));
    }

    private static int findUniquePaths(int m, int n) {
        int res=1;

        for (int i = 1; i < n; i++) {
            res = res*(m+i)/i;
        }

        return res;
    }
}
