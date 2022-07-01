package dsa.course.bit2;

public class ReverseTheBits {
    /**
     *  only for unsigned integer
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(reverseTheBits(3));
    }

    private static long reverseTheBits(int n) {
        System.out.println(Integer.toBinaryString(n));
        for (int i =0;i<=15;i++){
            n=SwapTwoBits.swap2Bits(n, i, 31-i);
        }
        System.out.println(Integer.toBinaryString(n));
        return n;
    }
}
