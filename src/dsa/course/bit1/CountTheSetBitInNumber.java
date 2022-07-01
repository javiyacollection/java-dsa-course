package dsa.course.bit1;

public class CountTheSetBitInNumber {
    /**
     *  TC theta(logN)
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(countTheSetBitInNumberEfficient(255));
    }

    public static int countTheSetBitInNumber(int s) {
        int res = 0 ;
        while(s>0){
            int lastBit = s&1;
            if (lastBit ==1) res++;
            s=s>>1; // s>>=1;
        }
        return res;
    }


    public static int countTheSetBitInNumberEfficient(int s) {
        int res = 0 ;
        while(s>0){
           s= s& (s-1);
           res++;
        }
        return res;
    }
}
