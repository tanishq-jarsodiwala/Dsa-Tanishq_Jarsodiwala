class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;
        // here i m taking ascill value with the help of that using xor opertion for both string 
        for(char c: s.toCharArray()){
            ans^=c;
        }
        // same above thing for this when same string willnot come these will be add is ans
        // its new concept so i will revise properly 
        
        for(char c: t.toCharArray()){
            ans^=c;
        }
        return ans;
    }
}
