class Solution {
    public int arrangeCoins(int n) {
        long left = 0; // always declare same thing in time of declaration and intailiastion 
        long right = n; // intially declare both varivbles 
        // use binary search 
        while(left <= right){
            long mid = left  + (right - left)/2; 
            // basically here we have seen left +right 0+8= 8
            long coins = mid *(mid+1)/2;
            // this formula used for n natural num sum

            if(coins  == n)
            return (int)mid;

            if(coins<n){
                left= mid + 1;
            }else{
                right= mid - 1;
            }
        }
        return (int) (right);
    
        
    }
}
