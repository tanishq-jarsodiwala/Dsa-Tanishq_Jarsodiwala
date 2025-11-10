class Solution {
      HashMap<Integer,Integer> map = new HashMap<>();

      // i m writing this outof the loop because i m calling one fuction that is outside this main fuction 
    public int minSwapsCouples(int[] row) {
      
        int n = row.length;
        for(int i=0; i<n; i++){
            map.put(row[i],i); 
            // bascially created one hashmap and trying to add the data in it 
            
        }        

        // here i m declaring the swap count beacuse i dont want to chnage this inside the loop 
        int swapcount= 0;
        for(int i =0; i<n; i+=2){
            int first = row[i]; // taking first element
            int second=0; // intailly its 0 beacause we need to find it evene or odd
            if(first%2==0) second=first+1;
            else second=first-1;
            // we know the value of i and i+1 will be like 0,1 in that way we are updating 
            if(row[i+1] != second){
                swapcount++; // here i m increasing the swap count 
                swap(row, i+1, map.get(second)); // at the time of calling normally pass the array name row not a row[]
                // in this swap function i m passing the i+1 where second will happen that index

            }
        }
        return swapcount;
    }

    public void swap(int row[], int i, int j){
        // here i can the varible nothing will happen
        int temp= row[i];
        row[i]= row[j];
        row[j]= temp; 

        // now swapping has happend but we have to update the hashmap for future 

        map.put(row[i],i); // here i m sharing i th value same for j means second 
        map.put(row[j],j);
    }
}
