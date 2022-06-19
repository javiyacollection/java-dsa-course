package dsa.course.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of given number is " + factorial(5));
    }

    private static int factorial(int a) {
        if(a==1) return 1;
        return a*factorial(a-1);
    }
}
