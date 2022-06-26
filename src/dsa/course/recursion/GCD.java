package dsa.course.recursion;

public class GCD {
    public static void main(String[] args) {
        System.out.println("GCD number is: "+ findGCD(270,192));
        System.out.println("GCD number is: "+ findGCD1(270,192));
    }

    private static int findGCD(int a, int b) {
        if(a==0) return b;
        if(b==0) return a;

        return findGCD(b,a%b);
    }

    private static int findGCD1(int a, int b) {
        if(a==b) return a;

        return a-b>b ? findGCD1(a-b,b):findGCD1(b,a-b);
    }
}
