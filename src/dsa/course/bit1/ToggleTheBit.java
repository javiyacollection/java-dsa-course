package dsa.course.bit1;

public class ToggleTheBit {
    public static void main(String[] args) {
        toogleTheBit("11011011", 4);

    }

    private static void toogleTheBit(String i, int n) {
        int decimal=Integer.parseInt(i,2);
        int mask = 1<<n;
        int result = decimal^mask;
        System.out.println(Integer.toBinaryString(result));
    }
}
