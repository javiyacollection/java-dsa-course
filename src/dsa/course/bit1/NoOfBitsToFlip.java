package dsa.course.bit1;

public class NoOfBitsToFlip {
    /**
     *  first XOR of 2 numbers and count set bits
     *
     * @param args
     */

    public static void main(String[] args) {
        System.out.println(noOfBitsToFlip(10,20));
    }

    private static int noOfBitsToFlip(int i, int j) {
        return CountTheSetBitInNumber.countTheSetBitInNumber(i^j);
    }
}
