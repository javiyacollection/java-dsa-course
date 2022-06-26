package dsa.course.recursion2;

public class Rod3Cutting {

    public static void main(String[] args) {
        System.out.println(maxRods(25,9,7,4));
    }

    static int maxRods(int N, int a, int b, int c){
        if(N==0) return 0;
        if(N<0) return -1;

        int cutA = maxRods(N-a, a,b,c);
        int cutB = maxRods(N-b, a,b,c);
        int cutC = maxRods(N-c, a,b,c);

        int res = Math.max(cutA, Math.max(cutB,cutC));
        if(res == -1) return  -1;

        return  res+1;
    }
}
