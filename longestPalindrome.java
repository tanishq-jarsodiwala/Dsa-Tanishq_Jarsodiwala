class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int ans = 0 ;
        boolean odd = false; // intail;y i m saying there is no availble 

        for(int count: map.values()){
            if(count % 2 == 0){
            ans += count;
            }
            else{
                ans += count-1;
                odd = true; // if here is 5 numbers then taken 4 carry 1 will be the part of it 
            }
        }

        if(odd){
            ans+=1;
        }

        return ans;
        
    }
}
