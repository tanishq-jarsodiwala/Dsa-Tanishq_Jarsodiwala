class Solution {
    public boolean canConstruct(String a, String b) {
        HashMap<Character,Integer> map= new HashMap<>();
        // running the first for loop for checking how many character in b
        for(char c: b.toCharArray() ){
            map.put(c,map.getOrDefault(c,0)+1);
            // if present key the add 1 otherwise create
        }
        for(char c: a.toCharArray()){
            // now checking the string a
            if(!map.containsKey(c) || map.get(c)==0){
            // here key is not presetn or if value is 0 then 
            return false;
            // how can i run that will not make any sense
        }
        // alway remember in thing containnskey and get work with map where ur values are present
        map.put(c,map.get(c)-1);
         // if presetn means matching hence remove 1 from that map 
        // if all things are fine then output is true after this loop
        }
        return true;
    }
}
