package dsa.course.bit1;

public class SwapTwoNumbers {

    /**
     * 3 times XOR
     * @param args
     */
    public static void main(String[] args) {
        swapTwoNumbers(10,25);
    }

    private static void swapTwoNumbers(int i, int j) {

        i=i^j;
        j=i^j;
        i=i^j;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
