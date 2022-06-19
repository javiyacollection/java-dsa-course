package dsa.course.recursion;

public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println("Given array is palindrome: " + isPalindrome(new int[]{1,2,3,3,1}));
    }

    public  static  boolean isPalindrome(int[]  a){
       return isPalindrpmeforIJ(a, 0, a.length-1);
    }

    private static boolean isPalindrpmeforIJ(int[] a, int i, int j) {
        if(i>j) return true;
        if(a[i]!=a[j]) return false;
        return isPalindrpmeforIJ(a, i+1, j-1);
    }
}
