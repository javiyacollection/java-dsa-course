package dsa.course.array4;

public class FindMaxLengthOfJMinusI {
    public static void main(String[] args) {
        FindMaxLengthOfJMinusI findMaxLengthOfJMinusI= new FindMaxLengthOfJMinusI();
        System.out.println("Longest distance: "+findMaxLengthOfJMinusI.findMaxLengthOfJMinusI(new int[]{5,4,1,7,2,8,6,3,4}));
    }

    public int findMaxLengthOfJMinusI(int[] a){
        int ans=0;
        int n = a.length;
        int[] leftMin = new  int[n];
        int[] rightMax = new  int[n];
        leftMin[0]=a[0];
        for (int i = 1; i < n; i++) {
            leftMin[i]=Math.min(a[i], leftMin[i-1]);
        }
        rightMax[n-1] = a[n-1];
        for (int i = n-2; i >=0; i--) {
            rightMax[i]=Math.max(a[i], rightMax[i+1]);
        }

        int i = 0, j = 0;
        while(i < n && j < n) {
            if(leftMin[i] < rightMax[j]) {
                ans = Math.max(ans, j-i);
                j++;
            } else {
                i++;
            }
        }

        return ans;
    }
}
