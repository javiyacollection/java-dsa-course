package dsa.course.bit1;

public class FindIthBit {
    public static void main(String[] args) {
        System.out.println(findIthBit(1011011, 3));
    }

    public static int findIthBit(int i, int n) {

        int mask = 1<<n;
        int result = i&mask;
        return result ==0 ? 0:1;
    }
}
