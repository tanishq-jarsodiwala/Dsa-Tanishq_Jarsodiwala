class Solution {
    public int mySqrt(int x) {
        int left= 0, right= x,count= 0, result=0;

        while(left<=right){
            int mid= left+(right-left)/2;
            long sq= (long) mid*mid; // taking long data type to avoid all mis confusion 
            if(sq == x){
                return mid;// here we get the final output

            }
            else if (sq <x){
                result= mid; // here mid will store 
                // here i m storing the whatever result comes in the first loop if nothing will good means the current ans will be right 
                left= mid+1;
            }
            else{
                right= mid-1;
            }
        }
        return result;
    }
}
