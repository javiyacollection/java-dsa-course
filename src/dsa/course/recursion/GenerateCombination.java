package dsa.course.recursion;

public class GenerateCombination {

    /**
     * Given two sorted arrays A and B, generate all possible arrays such that first element is taken from A then from B then from A and so on in increasing order till the arrays exhausted. The generated arrays should end with an element from B.
     * For Example
     *
     *
     *
     * A = {10, 15, 25}
     * B = {1, 5, 20, 30}
     *
     * The resulting arrays are:
     *   10 20
     *   10 20 25 30
     *   10 30
     *   15 20
     *   15 20 25 30
     *   15 30
     *   25 30
     * @param args
     */

    public static void main(String[] args) {

        int A[] = {10, 15, 25};
        int B[] = {5, 20, 30};
        generateCombination(A,B);

    }

    private static void generateCombination(int[] a, int[] b) {
        int[] c= new int[a.length+b.length];
        generateCombinationUtil(a,b,c,0,0,a.length,b.length, 0, true);
    }

    private static void generateCombinationUtil(int[] a, int[] b, int[] c, int i, int j, int m, int n, int index, boolean flag) {
        if(flag){
            if(index>0){
                printArr(c, index+1);
            }
            for (int k = i; k < m; k++) {
                if(index==0){
                    c[index]=a[k];
                    generateCombinationUtil(a,b,c,k+1, j,m,n,index, !flag);
                }else if(a[k]>c[index]){
                    c[index+1]=a[k];
                    generateCombinationUtil(a,b,c,k+1, j,m,n,index+1, !flag);
                }
            }
        }else{
            for (int l = j; l < n; l++) {
                if(b[l]>c[index]){
                    c[index+1]=b[l];
                    generateCombinationUtil(a,b,c,i, l+1,m,n,index+1, !flag);
                }
            }

        }


    }

    // A utility function to print an array
    static void printArr(int[] arr, int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
}
