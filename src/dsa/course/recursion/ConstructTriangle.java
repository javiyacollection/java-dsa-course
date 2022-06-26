package dsa.course.recursion;

import java.util.Arrays;

public class ConstructTriangle {
    public static void main(String[] args) {
        constructTriangle(new int[]{1,2,3,4,5});
//        printTriangle(new int[]{1,2,3,4,5});
    }

    public static  void constructTriangle(int[] a){
        if(a.length<1) return;

        int[]temp =new int[a.length-1];
        for (int i =0; i < a.length-1; i++) {
            temp[i]=a[i]+a[i+1];
        }

        System.out.println(Arrays.toString(a));
        constructTriangle(temp);
    }

    public static void printTriangle(int[] A)
    {
        // Base case
        if (A.length < 1)
            return;

        // Creating new array which contains the
        // Sum of consecutive elements in
        // the array passes as parameter.
        int[] temp = new int[A.length - 1];
        for (int i = 0; i < A.length - 1; i++)
        {
            int x = A[i] + A[i + 1];
            temp[i] = x;
        }

        // Make a recursive call and pass
        // the newly created array
        printTriangle(temp);

        // Print current array in the end so
        // that smaller arrays are printed first
        System.out.println(Arrays.toString(A));
    }
}
