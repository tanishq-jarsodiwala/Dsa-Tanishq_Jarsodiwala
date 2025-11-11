class Solution {
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
//  first of all i  will do transpose menas pull out the number from here then adding to their reverse i, j position 
        for(int i = 0 ; i<n ; i++){
            for(int j = i; j<n; j++){ // here n/2 required for middle element 
                int temp = matrix [i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]=temp;

            }
        }

        //  now we are rotating the square means whatver the las row n/2 that will be front 
        //  columns conditon goes to n/2 not for all columns  

        for(int i = 0 ; i<n; i++){
            for(int j= 0; j< n/2; j++){
                //  here i just want to change the value of middle to last coloumn with starting 1 to mid-1 column 
                // i need n - 1 - j { 3-1-0}= last index= [i][j] means first index in 3*3 matrix
                int temp= matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }

    }
}
