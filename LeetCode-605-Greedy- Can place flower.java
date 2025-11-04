class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        // Greedy Approch 
        // firstlly define for loop 
        for(int i = 0; i<f.length; i++){

            if(f[i] == 0 && 
           (i==0 || f[i-1] == 0) && 
            (i== f.length-1 || f[i+1] == 0)){
                // here basically checking all the condition means left right or when only 3 elements are ava 0 0 0 check for left right topmost left and topmost right and then start to solving the code 

                f[i] = 1; // staisfying all place 1;
                n--; // and removing 1 digit 
            } 

                if(n== 0) return true;


            } 
            return n<0;
        }
    
}
