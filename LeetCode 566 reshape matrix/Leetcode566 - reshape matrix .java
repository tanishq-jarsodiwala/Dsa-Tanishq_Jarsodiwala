class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {    
        int n = mat[0].length;// columns 
        int m = mat.length; // rows
        if(m*n!= r*c) return mat;
        // means no elements are common then retrun original matrix 
        // here now i have to create 2d array as per question 
        int newarr[][]= new int[r][c]; // this is for new 2d whatever user will put 
        // before entering the loop decide rows and columns for new 2D array 
        int rows=0, cols=0; // intially 0
        for(int i = 0; i<m; i++)
        { // this loop for rows 
            for(int j = 0; j<n; j++ ){
                // this loop for columns
                newarr[rows][cols]= mat[i][j];
                // here i m matching the rows and cols with last one 
                // firstlly we will cols element then rows
                cols++;

                // once cols elements finish then check it and update the rows count so start from the second rows
                if(cols==c){ // user will define c
                    // if cols reach original cols
                    // here checking the we reach the last cols or not 
                    cols= 0; 
                    rows++;
                    // means now we are moving towards the next row
                }
                


            }
        }
        return newarr; // this is the final result
        
    }
}
