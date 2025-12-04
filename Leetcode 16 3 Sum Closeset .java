class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);// sorting the array 
        int result=0;
        for(int i= 0; i<nums.length-2; i++){
            int left= i+1;
            int right= nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                // here u have to define what is result here 
               if(i == 0 && left == i+1 && right == nums.length-1){
                result= sum;
                // first time when u are solving this solution

               }
                // here basically i have to check whether the values are present .. and try to use Math.abs library because it important for our code
                if(Math.abs(sum - target) < Math.abs(result- target)){
                    // now here i m adding the sum and change to real position 
                    result=sum;
                    // here the current vlaue is smaller than this hence 
                }
                //checking the first case where the values are match
                if(sum == target){
                    // it rare but if u get the ans in first iterations that menas it good
                    return sum;
                }
                else if(sum < target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
        // otherwise resukting result will be the answer
    }
}
