package dsa.course.bit1;

public class SetIthBit {
    public static void main(String[] args) {
        setIthBitOne(521, 4);
    }

    private static void setIthBitOne(int num, int n) {
        int mask = 1<<n;
        System.out.println(Integer.toBinaryString(num));
        int result = num |mask;
        System.out.println(Integer.toBinaryString(result));
    }
}
