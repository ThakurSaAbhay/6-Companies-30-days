class rotatefunction {
    public int maxRotateFunction(int[] A) {
        if(A.length == 0){
            return 0;
        }
        int dp[]=new int[A.length];
        int sum =0, iteration = 0, len = A.length;
        
        for(int i=0; i<len; i++){
            sum += A[i];
            dp[0]+=i*A[i];
        }
        
        int max = dp[0];
        for(int j=1; j<len; j++){
            // for next iteration lets remove one entry value of each entry and the prev 0 * k
            dp[j] = dp[j-1]- sum + A[j-1]*len;
            max = Math.max(max, dp[j]);
        }
        
        return max;
    }
}