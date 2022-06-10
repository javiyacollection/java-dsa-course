package dsa.course.array1;

import java.util.Arrays;

public class ReplaceWithRightGreatest {
    public static void main(String[] args) {
        System.out.println(" Replaced with right greatest element is: " + Arrays.toString(replaceWithRightGreatest(new int[]{7,5,8,9,6,8,5,7,4,6})));
    }

    private static int[] replaceWithRightGreatest(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for(int j=i+1; j< arr.length;j++){
                max=Math.max(max, arr[j]);
            }
            arr[i]=max;
        }
        return arr;
    }
}
