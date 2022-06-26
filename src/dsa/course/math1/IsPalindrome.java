package dsa.course.math1;

public class IsPalindrome {

    public static void main(String[] args) {
//        System.out.println(isPalinDrome(123214));
        System.out.println(isPalinDromeRecursion(12321,0,12321));
    }

    private static boolean isPalinDromeRecursion(int i, int reverse, int reminder) {
        if(i==reverse) return  true;
        if(reminder==0) return false;
        return isPalinDromeRecursion(i, reverse*10+ reminder%10, reminder/10);
    }

    private static boolean isPalinDrome(int i) {
        int reverse =0, reminder=0, orig= i;
        while(i>0){
            reminder = i%10;
            i= i/10;
            reverse = reverse*10+reminder;

        }


        return orig==reverse;
    }
}
