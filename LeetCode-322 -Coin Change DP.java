class Solution {
    public int coinChange(int[] coins, int amount) {
        // in this dynamice problem  i have to use memoization to calculate next value
        if(amount == 0) return 0;
        // crating a array to fill the value 
        int []  dp = new int [amount+1]; 
        // creatring one more space = reach to the infinity 
        Arrays.fill(dp,amount+1); // showing infinity
        dp[0]=0; 
        // first index is 0 

        for(int i = 1 ; i<=amount; i++){ // here 0 is fixed in dp[0] so start with dp[1]
            // this  first loop goes to 0 to 11 
            for(int c : coins){
                //this for coins array to pick and check
                if(i-c >=0 ){ // this not need first two but when value is big then needed 
                // here checking for coin not value 
                    dp[i] = Math.min(dp[i], 1+dp[i-c]);
                }
            }
        }
// in any case means coin 2 and amount is 5 
        return dp[amount] > amount ? -1 :dp[amount];
        //alredy puted max value in it hence dp[amount] needed
        }
}
