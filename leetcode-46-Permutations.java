class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // creating one function with the help of this function moves back and front
        List<Integer> templist = new ArrayList<>();
        backtrack(result,templist,nums);
        return result;


        
    }
    // this function is creating for the printing the numbers 

    public void backtrack(List<List<Integer>> result, List<Integer> templist, int nums[]){
            // if 3 elemensts in the first list so 3 in the arraylist or not chekcing 
        if(templist.size() == nums.length){
            result.add(new ArrayList<>(templist));
            // adding the copy not real element 
            return ;
            // this is base condition 

        }

        for(int i: nums){
            // adding the first element on first place 
            // here i need the unique new element if something has been used dont take it again    
            if(templist.contains(i)) continue;
            // use i beacuse we have to focus on it not on nums 
            
            templist.add(i);
            // backtracking the path against to 0 
            backtrack(result,templist,nums);
            // but first element has been found so go to 2nd element
            templist.remove(templist.size()-1);// here basically removing that element i added there
        }
    }
}
