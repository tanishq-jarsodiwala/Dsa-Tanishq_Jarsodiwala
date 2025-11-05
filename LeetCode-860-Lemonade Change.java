class Solution {
    public boolean lemonadeChange(int[] b) {
        int five= 0;
        int ten= 0;
      //creating two varble means two count varible 
       

        for(int i=0 ; i<b.length; i++){
            if(b[i] == 5){
                five++; // if stisfy the current condition means only 5 then add
            }
            else if(b[i] == 10){
                  ten++; // if ten add
                 if(five == 0){
                    return false;
                }else{
                   // but at the time returning give him 5 back
                     five--;
                }
            }
            else if(b[i]== 20){
                if(five > 0 && ten >0){
                    ten--;
                    five--; // at the time of 20 give one 5 and 10
                }
                else if(five >= 3){
                    five-=3; // if less than 3 fives minus it and give
                    
                }else{
                    return false; // otherwise says false
                }

            }
        }
        return true; // if runs whole loops say true 

        
    }
}
