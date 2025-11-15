class Solution {
    public int jump(int[] nums) {
        if(nums.length <=1) return 0;
        // here we are on the same index not need to jump
        //declaring 3 parameters
        int jump=0;
        int howlongjump=0;
        int endofcurrjump=0;

        for(int i =0; i<nums.length-1; i++){
            howlongjump=Math.max(howlongjump,i+nums[i]);
            // from that index how much long jump i can take

            if(i==endofcurrjump){
                jump++;
                //in starting both are 0 then we take 1 jump 
                endofcurrjump=howlongjump;//here i need to scan all index from 0 to 2
                if(endofcurrjump>= nums.length-1){
                    break; // here i reached the last stage 
                    // there is no more steps just break the loop 
                    // retrun should be after completing all 
                }

            }

        }
        return jump;


        
    }
}
