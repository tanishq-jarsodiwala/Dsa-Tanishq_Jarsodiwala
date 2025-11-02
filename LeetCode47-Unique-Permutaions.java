class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //creating a array list
        Arrays.sort(nums);
        //sorting the array 
        List<Integer> templist = new ArrayList<>();
        //basically here creating the templist 
        backtrack(result,templist,nums,new boolean[nums.length]);
        // if i m not passing anything there that means automatically created in the function just change the name 
        return result;

    }

    public void backtrack(List<List<Integer>> result, List<Integer>templist,int nums [] , boolean usedele []){
        if(templist.size () == nums.length && 
        !result.contains(templist) ){
            result.add(new ArrayList <>(templist));
            // here i need to store the copy not same array 
            return ; 

            // not should be the dublicate 

        }

        for(int i=0 ; i<nums.length ; i++){
            // if used mark as skip 
            if(usedele[i]) continue ;
            //means focusing the next element 
            
            usedele[i] = true;
            templist.add(nums[i]); // adding and mark as true

            backtrack(result,templist,nums,usedele);
            // go back and try new element 

            usedele[i]= false;
            templist.remove(templist.size()-1);
            // removing that element 

            
         }

    }
}
