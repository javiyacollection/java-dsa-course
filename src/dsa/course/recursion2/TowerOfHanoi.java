package dsa.course.recursion2;

public class TowerOfHanoi {
    public static void main(String[] args) {
        printStepsOfTowerOfHanoi(3,'A','C','B');
    }

    private static void printStepsOfTowerOfHanoi(int n, char from, char to, char aux) {
        if(n==0) return;
        printStepsOfTowerOfHanoi(n-1, from, aux, to);
        System.out.println("Move " + n + " from "+ from + " to " + to);
        printStepsOfTowerOfHanoi(n-1,  aux, to, from);

    }
}
