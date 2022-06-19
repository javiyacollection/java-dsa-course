package dsa.course.recursion;

public class PossibleCombination {

    public static void main(String[] args) {
  /*      int input[] = { 1, 2, 3 ,4};
        // int input[] = {10,11,12,13};
        possibleNumbers(input, 0);*/

        int arr[] = {1, 2, 3, 4, 5};
        int r = 3;
        int n = arr.length;
//        printCombination(arr, n, r);
        printCombination(n, r);
    }

    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r)
    {
        // Current combination is ready to be printed, print it
        if (index == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }

    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    static void printCombination(int arr[], int n, int r)
    {
        // A temporary array to store all combination one by one
        int data[]=new int[r];

        // Print all combination using temporary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r);
    }

    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    static void printCombination( int n, int r)
    {
        // A temporary array to store all combination one by one
        int data[]=new int[r];
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=i+1;
        }

        // Print all combination using temporary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r);
    }


    public static void possibleNumbers(int[] x, int index) {
        if (index == x.length) {
            for (int i = 0; i < x.length; i++) {
                System.out.print(x[i] + " ");
            }
            System.out.println();
        }
        for (int i = index; i < x.length; i++) {
            int temp = x[index];
            x[index] = x[i];
            x[i] = temp;
            possibleNumbers(x, index + 1);

            temp = x[index];
            x[index] = x[i];
            x[i] = temp;
        }
    }
}
