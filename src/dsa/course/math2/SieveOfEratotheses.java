package dsa.course.math2;

import java.util.Arrays;

public class SieveOfEratotheses {
    /**
     *
     * TC - O(n log(log(n)))
     * @param args
     */
    public static void main(String[] args) {

        printuntillNPrimeNumbers(30);
    }

    private static void printuntillNPrimeNumbers(int n) {

        boolean[] primeArr = new boolean[n+1];
        Arrays.fill(primeArr,true);
        isPrimeNumbers isPrimeNumbers = new isPrimeNumbers();

        for (int i = 2; i *i<=n; i++) {
            if(primeArr[i] && isPrimeNumbers.isPrimeNumber(i)){
                for(int j = i ; j*i<=n; j++){
                    primeArr[j*i] = false;
                }

            }
        }

        for (int i = 2; i < n; i++) {
            if (primeArr[i]) System.out.println(i);
        }


    }
}
