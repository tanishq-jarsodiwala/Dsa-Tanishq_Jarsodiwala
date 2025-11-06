class Solution {
    public int climbStairs(int n) {
        // just imagine u have 3 staris and u have 3 ways to go there 
        //  u calculate by n = n-1 +n-2;

        if(n==1) return 1;
        // here creating array to solve it 
        int [] dp = new int[n+1]; // this is the size of array
        // here n+1 to caluclate the final answer;
        dp[1]=1; // for first stair 
        dp[2]=2; //for 2nd stair

        for(int i =3; i<=n; i++){
            dp[i]= dp[i-1] +dp[i-2];
        }  
        return dp[n]; // means sharing last position      
    }
}
