package dsa.course.matrix;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {

        RotateMatrix rotateMatrix= new RotateMatrix();
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotateMatrix.printMatrix(a);
        a = rotateMatrix.rotateMatrix(a);
        System.out.println("----------------------");
        rotateMatrix.printMatrix(a);
    }

    public int[][] rotateMatrix(int[][] a){

        a= transposeMatrix(a);
        System.out.println("----------------------");
        printMatrix(a);
        reverseMatrix(a);
        return a;
    }

    private int[][] reverseMatrix(int[][] a) {

        int n = a.length;
        for (int i = 0; i <a.length; i++) {
            for(int j=0;j<a.length/2;j++){
                int temp = a[i][j];
                a[i][j]=a[i][n-j-1];
                a[i][n-j-1]=temp;
            }

        }


        return a;
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
