package dsa.course.matrix;

public class SearchElementInSortedMatrix {
    public static void main(String[] args) {
       SearchElementInSortedMatrix searchElementInSortedMatrix= new SearchElementInSortedMatrix();

        int[][] a = {
                {1,4,5,7},
                {2,5,6,9},
                {6,10,11,13}
        };
        int key=50;
        System.out.println("Is "+key +" present in matrix:" );
        boolean result = searchElementInSortedMatrix.searchElementInSortedMatrix(a, key);
        System.out.println("result: " + result);
    }

    public boolean searchElementInSortedMatrix(int[][] a, int key){
        int rowLength = a.length;
        int colLength= a[0].length;
        for (int i = 0; i <rowLength; i++) {
            for(int j=colLength-1;j>=0;j--){
                if(a[i][j]<key){
                    break;
                }
                if(a[i][j]==key){
                    return true;
                }
            }
        }
        return false;
    }
}
