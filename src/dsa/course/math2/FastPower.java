package dsa.course.math2;

public class FastPower {

    /**
     *  TC - log(b)
     * @param args
     */
    public static void main(String[] args) {
//        System.out.println(fastPower(3,1));

        System.out.println(Integer.valueOf("101".charAt(1)));
    }

    private static int fastPower(int a, int b) {
        if(b==1) return a;
        int halfRes = fastPower(a, b/2);
        int fullRes  = halfRes*halfRes;
        return (b%2==0)? fullRes:fullRes*a;
    }
}
