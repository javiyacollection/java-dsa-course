package dsa.course.math1;

public class LCM {

    public static void main(String[] args) {
        System.out.println(lcm(24,36));
    }

    private static int lcm(int a, int b) {

        return a*b/findGCD(a,b);
    }

    private static int findGCD(int a, int b) {
        if(a==0) return b;
        if(b==0) return a;

        return findGCD(b,a%b);
    }
}
