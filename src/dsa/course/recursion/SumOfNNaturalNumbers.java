package dsa.course.recursion;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        SumOfNNaturalNumbers sumOfNNaturalNumbers= new SumOfNNaturalNumbers();
        System.out.println("Sum of N natural number : "+sumOfNNaturalNumbers.printSumOfNaturalNumbers(5));
//        printNaturalNumbers(5);

    }

    private static void printNaturalNumbers(int i) {
        if(i==0) return;
        printNaturalNumbers(i-1);
        System.out.println(i);
    }

    int printSumOfNaturalNumbers(int i) {
        if(i==0) return 0;
        return printSumOfNaturalNumbers(i-1)+i;
    }
}
