package dsa.course.bit2;

public class FindNonRepeatingElement {
    public static void main(String[] args) {
        System.out.println(findNonRepeatingElement(new int[]{2,1,4,1,2,3,4}));

    }

    private static int findNonRepeatingElement(int[] arr) {
        int res = 0;
        for(int i :arr) res = res^i;

        return res;
    }


}
