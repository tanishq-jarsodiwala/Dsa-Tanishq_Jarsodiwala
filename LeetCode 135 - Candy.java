class Solution {
    public int candy(int[] ratings) 
    {

    int n= ratings.length;
    int [] ans = new int [ratings.length];
    // intailly i feel all these with 1  for equal distirbuation 
    Arrays.fill(ans,1);

// first for loop moving left to right checking the condition

    for(int i=1; i<ratings.length; i++){
        if(ratings[i]> ratings[i-1]){
            ans[i]= ans[i-1]+1;

        }
    }
    //  2nd for loop from right to left travel
    for(int i = n-1; i>0; i--){
        if(ratings[i]<ratings[i-1] && ans[i]>=ans[i-1]){
            ans[i-1]= ans[i]+1; // this reverse looping 
        }
    }
    return Arrays.stream(ans).sum();
    }
}
