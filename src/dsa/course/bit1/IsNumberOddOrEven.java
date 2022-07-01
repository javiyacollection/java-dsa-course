package dsa.course.bit1;

public class IsNumberOddOrEven {

    public static void main(String[] args) {
        System.out.println(isNumberOddOrEven(12));
    }

    static boolean isNumberOddOrEven(int n){
//        System.out.println(n&1);
       return (n&1)==1?false:true;

    }

}
