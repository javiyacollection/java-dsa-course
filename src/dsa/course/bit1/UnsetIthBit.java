package dsa.course.bit1;

public class UnsetIthBit {
    public static void main(String[] args) {
        unsetIthBit(521,2);
    }

    private static void unsetIthBit(int num, int n) {
        int mask = 1<<n;
        System.out.println(Integer.toBinaryString(num));
        int bit = FindIthBit.findIthBit(num,n);
        if(bit==1)  num = num^mask;
        System.out.println(Integer.toBinaryString(num));
    }
}
