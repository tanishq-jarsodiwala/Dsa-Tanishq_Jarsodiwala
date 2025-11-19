class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        // here i m using very simple logic is that number is present then mark is -ve on their place otherwise  remain same 

        for(int i= 0 ; i<nums.length; i++){
            // first all check the number
            int value= Math.abs(nums[i]);
            // means something - ve convert to positive and we can check // here taking only 
            // here converting into index
            int index= value-1; // with the help of that we can find out indexing 
            if(nums[index]>0){ // here focusing on index not on the value hence use index
                nums[index]= -nums[index]; // that means theat partciular element has come marked his index as -ve

            }

        }
        // once all thing has done check the how many positive elements in the array 
        for(int i =0; i<nums.length;i++){
            if(nums[i]>0) list.add(i+1); // here i m adding the index of it 
        }
        return list;
        // from here we make list with all numbers 
    }
}
