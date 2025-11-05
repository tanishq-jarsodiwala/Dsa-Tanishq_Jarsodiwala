class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2) return true;
        // 0 and 1 are perfect square 
        long left = 2; // start with 2 
        long right= num/2; //end num by 2 because checking the middle element 
        //using binvary search 
        while(left <= right){
            // here finding the mid element 
            long mid = left +(right -left)/2; // here finding the mid element 
            long sq = mid*mid; // here doing square of mid ele 

            if(num == sq) return true; // if yes the true 
            else if(sq<num){
                left = mid+1; // if small then search in right 
            }
            else if (sq>num){
                right = mid-1; // if big search in left 
            }


        }
        return false;

    }
}
