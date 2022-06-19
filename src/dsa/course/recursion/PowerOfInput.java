package dsa.course.recursion;

public class PowerOfInput {

    public static void main(String[] args) {
        PowerOfInput powerOfInput = new PowerOfInput();
        System.out.println(powerOfInput.powerOfInput(3,4));
    }

    private int powerOfInput(int a, int b) {
        if(b==1) return a;
        return powerOfInput(a, b-1) *a;
    }
}
