package dsa.course.bit1;

public class FindXORofN {
    public static void main(String[] args) {
        System.out.println(findXORTillN(7));
    }

    private static int findXORTillN(int n) {
        int res=0;
        for(int i=1; i<=n;i++) res ^=i;
        return res;
    }
}
