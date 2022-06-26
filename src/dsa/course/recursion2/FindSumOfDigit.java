package dsa.course.recursion2;

public class FindSumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(12345));
    }

    private static int sumOfDigit(int i) {
        if(i==0) return 0;
        return i%10+sumOfDigit(i/10);
    }
}
