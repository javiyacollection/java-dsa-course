package dsa.course.bit2;

public class FindTwoNonRepeatingElement {

    /**
     *  TC - O(n)
     * @param args
     */

    public static void main(String[] args) {
        findTwoNonRepeatingElement(new int[]{2,1,4,1,2,3,4,7});

    }

    private static int[] findTwoNonRepeatingElement(int[] arr) {
        int xor = 0;
        for(int i :arr) xor = xor^i;
        int temp = xor;
        int mask = xor & ~(xor-1);

        for(int i :arr) {
            if((mask &i) ==0){
                temp = temp^i;
            }
        }

        int firstNumber = temp;
        int secondNumber = xor^firstNumber;

        return new int[]{firstNumber,secondNumber};
    }


}
