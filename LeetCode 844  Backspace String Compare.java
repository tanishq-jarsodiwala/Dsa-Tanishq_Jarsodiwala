class Solution {
    public String check(String str){
        Stack<Character> st= new Stack<>();
        for(char c: str.toCharArray()){
          if(c=='#'){ // here firstly checking the stack the value of current charadcter is '#' or not as per that we will decide the output 
            if(!st.isEmpty()){
                st.pop();
            }}
            else{
                st.push(c);
            
          }
        }
        // here i m creating stringbuider method for the class
        StringBuilder sb= new StringBuilder();
        for(char c: st){
            sb.append(c);
        }
        return sb.toString(); // here i m checking the final string 

    }
    public boolean backspaceCompare(String s, String t) {
        // here i m trying to create a new function that willuses both string 
        return check(s).equals(check(t));

    }
}
