class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0;
        // now finding the value of where loop will start 
        for(int i= 0; i<gas.length; i++){
            //adding the gas and cost ,is this possible or not 
            totalgas+=gas[i];
            totalcost+=cost[i];
        }

        // if gas is less than cost then how can you run this vehicle 
        if(totalgas<totalcost){
            return -1;
        }

        // now iterating each index check where is my starting point 
        int currentgas = 0;
         int startindex =0;
        for(int i =0 ; i< gas.length ; i++){
            // currentgas calculate by adding the gas value - cost 
            currentgas += gas[i] - cost[i];
            // curr value is neg means forget this place all place till that place and start with next index 
            if(currentgas < 0){

                startindex = i+1; // with next index 
                currentgas = 0; // here this is 0 because we need to recalculate all things 

            }
        
        }
        return startindex; // this is position where loop will start 

    }
    }
