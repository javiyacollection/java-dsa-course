package dsa.course.bit1;

public class CheckNumberIsPowerOfTwo {

    public static void main(String[] args) {

        System.out.println(checkNumberIsPowerOfTwo(32));
    }

    private static boolean checkNumberIsPowerOfTwo(int i) {
        return  (i & (i-1)) ==0;
    }
}
