package dsa.course.bit2;

public class SwapTwoBits {
    public static void main(String[] args) {

        swap2Bits(521,2,1);
    }

    public static int swap2Bits(int n, int i, int j) {
//        System.out.println(Integer.toBinaryString(n));
        int orij = n;
        int iPos= (n>>i) &1;
        int jPos= (n>>j) &1;
        if((iPos ^ jPos) == 0) return orij;

        int mask = (1<<i) | (1<<j);
        int swap = orij^mask;
//        System.out.println(Integer.toBinaryString(swap));

//        System.out.println("-----------------------------");
        return swap;
    }

}
