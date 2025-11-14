class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int distinctcount=1; // means at least one element will always present
        int current=nums[n-1]; //menas last index is current state of the array 
        // if 2 elements are there then last will be max

        for(int i=n-2; i>=0; i--){
            if(nums[i]!=current){
                //not matching means distint count 
                distinctcount++;
                // then after shifiting last to second last beacuse need to check reamining whole array 
                current=nums[i];
        }
        if(distinctcount ==3) return current ;
        //here if distinct count is increses and touch to 3 means we will reach there

    }
    return nums[n-1];
    // if 2 or less 2 elements are there that means we return it 
}
}
