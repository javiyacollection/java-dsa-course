package dsa.course.backtracking;

public class SubSetProblem {

    public static void main(String[] args) {
        System.out.println(subsetProblem(22, new int[]{2,3,5,8,4}, 4));
    }
    static boolean subsetProblem(int sum, int[] a, int N){

        if(sum<0) return false;
        if(N<0) return false;

        if(sum==0) return true;
        return  subsetProblem(sum-a[N], a, N-1) || subsetProblem(sum, a, N-1);

    }
}
