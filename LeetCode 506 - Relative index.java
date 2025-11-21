class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        // here finding the length;
        // now createing 2d array 
        int arr [] [] = new int[n][2];
        // here n is row and 2 is column 
        for(int i= 0; i<n;i++){
            arr [i][0]= score[i]; // here scoring the score
            arr[i][1]= i; // here just stroing the index;
        }

// before this sorting the array by score 
        Arrays.sort(arr,(a,b) -> b[0]-a[0]); // here 
        // b[0] means first row and b[1]= 
        // as per question logic now i m  adding the string Array 
        
        String ans[]= new String[n];// the length of string array is same as per the given array 
        for(int i = 0; i<n;i++){
            // here i m taking index 
            int index= arr[i][1];

            if(i == 0) ans[index]= "Gold Medal"; // if i is 0 then shows the first rank 
            else if(i ==1) ans[index]= "Silver Medal";
            else if(i ==2) ans[index]= "Bronze Medal";
            else ans[index]= String.valueOf(i+1);
            // if ans is not coming the value will be the increasing as per the 
        }
        return ans;
    }
}
