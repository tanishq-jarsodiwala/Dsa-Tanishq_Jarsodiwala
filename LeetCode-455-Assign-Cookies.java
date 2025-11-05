class Solution {
    public int findContentChildren(int[] g, int[] s) {

//  2nd two pointer approch 
    //  firstly sort both array 

    Arrays.sort(g);
    Arrays.sort(s); // sorting is required to assign cookies in very well manner 

    //  we need two pointer one for children and 2nd one for cookies 
    int m = g.length;
    int n = s.length;
    int i= 0;
    int j =0;
    int ans = 0;
    while(i<m && j<n ){
        // checking the given condition 
        if(s[j] >= g[i]){
            //  menas current cookies i can assign or not 
            //  if yes then go to next index
            i++;
            ans++;
         
            

        }
        j++;
            // i cant assign that means that means go to next child 
    }
    return ans; // means assign the values menas this is the count of our answer 
        
    }
}

//  Arrays.sort(g);
//         Arrays.sort(s);
//         int count = 0;
//         for(int i = 0; i< g.length ; i++){
//             for(int j = 0; j<s.length; j++){
//                 if(s[j] >= g[i]){
//                     // yes if any big cookies ava that also satisfy 
//                     s[j]= -1;
//                     // here required to remove that cookies beacuse i assign it 
//                     // increase the count by 1 so we will have idea how many choildren have been completed till now 
//                        count++;
//                        break;
//                        // here break is needed to count specifically and start a loop form start as well as put -1 shows children never be negative 


//                 }
                
//             }
//         }
//         // return count;
