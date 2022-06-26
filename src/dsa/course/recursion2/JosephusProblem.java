package dsa.course.recursion2;

public class JosephusProblem {

    public static void main(String[] args) {
        System.out.println(josephusProblem(5,2));
    }

    private static int josephusProblem(int n, int k) {

        if(n==1)
            return 1;
        else
            return (josephusProblem(n-1,k)+k-1)%n+1;
    }
}
