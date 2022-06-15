package dsa.course.matrix;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        TransposeMatrix transposeMatrix = new TransposeMatrix();
        transposeMatrix.printMatrix(a);
        a = transposeMatrix.transposeMatrix(a);
        System.out.println("-------------------");
        transposeMatrix.printMatrix(a);
    }

    public int[][] transposeMatrix(int[][] a){

        for (int i = 0; i <a.length; i++) {
            for(int j=i;j<a.length;j++){
                int temp = a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }

        }

        return a;
    }

    public void printMatrix(int[][] a){
        Arrays.stream(a).forEach(ints -> System.out.println(Arrays.toString(ints)));

    }

}
