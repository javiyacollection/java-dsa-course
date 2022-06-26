package dsa.course.math1;

public class TrailingZeroesInFactorial {
    public static void main(String[] args) {
        System.out.println("trailing zeros: " + trailingZeros(125));
    }

    private static int trailingZeros(int i) {
        int res =0;
        while(i>0){
            res += i/5;
            i/=5;
        }
        return res;
    }
}
