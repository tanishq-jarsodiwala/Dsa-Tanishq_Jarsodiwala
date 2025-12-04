class Solution {
    public int calPoints(String[] ops) {
        int result= 0;
        Stack<Integer> st= new Stack<>();
        for(int i =0; i<ops.length; i++){
           if(ops[i].equals("C")){
            st.pop();
           }
           else if( ops[i].equals("D")){
            st.push(st.peek()*2);
           }
           else if(ops[i].equals("+")){
            // first store stack top 
            int top= st.pop(); // storing last element
            int newtop= st.peek()+top;// here adding the last value
            st.push(top);
            st.push(newtop);
           }
           // everywhere used ops[i] for checking the current value 
           else{
            st.push(Integer.parseInt(ops[i]));// simply add the value there

            // whatever the data will come diretly push there

           }
        }
       // now here i m resolving the answer
       for(int i : st){
        // st is also array
        result+=i;
       }
       // this is the total result by calculating the all things
       return result;
    }
}
