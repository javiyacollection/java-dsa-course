package dsa.course.math2;

public class isPrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(40));
    }

    public static boolean isPrimeNumber(int n){

        if(n<=3) return true;
        if(n%2==0 || n%3==0) return false;

        for (int i = 5; i *i <= n; i=i+6) {
            if(n%i==0 || n %(i+2) == 0) return false;
        }
        return true;
    }

}
