class Solution {
    public int addDigits(int num) {
        
        while(num >=10){
            int sum = 0;
            // if less than 10 means we have to show the same answer
            while(num>0){
                int digit = num % 10;
                // here taking last digit
                sum +=digit;
                // adding last digit 
                num = num/10;
                // here discarding the digit 
                
            }
            num= sum; // after replacing the main num with the current sum 
        }
        return num;
        
    }
}
