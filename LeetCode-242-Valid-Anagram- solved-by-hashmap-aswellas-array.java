class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length() != t.length()) return false;

      int count [] = new int[26]; 
    //   representing the all elements from  a to z

    for(int i = 0; i<s.length(); i++){ // checking all index
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
        // like hashmap checking adding the value and removing it 


    }
    for(int c: count){ // means count not 0 some values are there not subtract yet 
        if(c !=0) return false;
        // means still some characters present 
    }
    return true;

        
    }}

//  this is solved by hashmap may be it will take some time but this is useful for all cases not for smaller charcter like this examples test cases

// }
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length() != t.length()) return false;

//         HashMap <Character,Integer> map = new HashMap<>();
//         //creating hashmap 
//         for(char c : s.toCharArray()){
//             map.put(c,map.getOrDefault(c,0)+1);
//             // here always notice that map.getOrDefault for all cases 
//         }
//         // intially plus one and increase if multiple comes 
//         // this loop for t string and checking this letter is the part of it or not 
//         for(char c : t.toCharArray()){
//             if(!map.containsKey(c)) return false;
//             // if that particular character present then remove it and add -1 at the end it will become 0 
//             map.put(c,map.get(c) -1);
//             // if c values less than 0 means not equal amount of character in both array 
//             if(map.get(c)< 0) return false;
//         }
//         return true;

        
//     }
// }
