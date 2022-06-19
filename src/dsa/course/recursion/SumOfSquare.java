package dsa.course.recursion;

public class SumOfSquare {
    public static void main(String[] args) {
        System.out.println("Sum of sqr of given number is "+ sumOfSqaure(9) );
    }

    private static int sumOfSqaure(int a) {
        if(a==1) return 1;
        return a*a + sumOfSqaure(a-1);
    }

}
