package dsa.course.recursion;

public class GCD {
    public static void main(String[] args) {
        System.out.println("GCD number is: "+ findGCD(270,192));
    }

    private static int findGCD(int a, int b) {
        if(a==0) return b;
        if(b==0) return a;

        return findGCD(b,a%b);
    }

}
