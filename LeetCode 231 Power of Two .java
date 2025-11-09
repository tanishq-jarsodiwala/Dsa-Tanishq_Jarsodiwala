class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        
        while(n%2 == 0){ // here checking the number 
            n /= 2;
            // here dividing the number
        }
        return n==1;
        //  here at the end 2/2 ==1 in that we decided yes this is right-

        
    }
}
