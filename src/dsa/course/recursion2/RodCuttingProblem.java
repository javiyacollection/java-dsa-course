package dsa.course.recursion2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RodCuttingProblem {
    public static void main(String[] args) {
        System.out.println(minCost(7, new int[]{1,3,4,5}));
    }

    public static int minCost(int n, int[] cuts) {
        List<Integer> c = new ArrayList<>();
        for (int cut : cuts)
            c.add(cut);
        c.addAll(Arrays.asList(0, n));
        Collections.sort(c);
        int[][] dp = new int[c.size()][c.size()];
        for (int i = c.size() - 1; i >= 0; --i)
            for (int j = i + 1; j < c.size(); ++j) {
                for (int k = i + 1; k < j; ++k)
                    dp[i][j] = Math.min(dp[i][j] == 0 ? Integer.MAX_VALUE : dp[i][j],
                            c.get(j) - c.get(i) + dp[i][k] + dp[k][j]);
            }
        return dp[0][c.size() - 1];
    }


    public static int minCost1(int n, int[] cuts) {
        List<Integer> c = new ArrayList<>();
        for (int cut : cuts)
            c.add(cut);
        c.addAll(Arrays.asList(0, n));
        Collections.sort(c);
        return minCostUtil(1, cuts.length, c);
    }
    public static int minCostUtil(int i, int j, List<Integer> c){
        if(i>j) return 0;
        int mini = Integer.MAX_VALUE;

        for (int ind = i; ind <= j; ind++) {
            int cost = c.get(j+1)-c.get(i-1)+minCostUtil(i, ind-1, c) + minCostUtil(ind+1, j, c);
            mini=Math.min(cost, mini);
        }
        
        
        return mini;
    }



}
