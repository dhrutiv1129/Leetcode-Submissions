class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return steps(0,n, memo);
        
    }
    private int steps(int i, int n, int[]memo){
        
        if(i == n){
            return 1;
        }
        if(i > n){
            return 0;
        }
        if(memo[i] != -1){
            return memo[i];
        }
        memo[i] = steps(i + 1, n, memo) + steps(i + 2,n, memo);
        return memo[i];
    }
}