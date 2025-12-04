/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    
    public int firstBadVersion(int n) {
         int left= 0,right= n, result= n; 
        // here only 1 reason if all bad then output will bad
      
        while(left<= right){
            int mid= left+(right-left)/2;
            if(isBadVersion(mid)){
            result=mid;
            right= mid-1;
            // here we are shifting a logic 
 }
            

        else{
            left= mid+1;
        }
        }
       
        return result;
 
    }
}
