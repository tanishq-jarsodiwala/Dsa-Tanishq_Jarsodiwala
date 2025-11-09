class Solution {
    public int lengthOfLastWord(String s) {
    String newstr = s.trim();
    // remove all leading and trailing spaces 

    //  now making one array where i will fill the all elements
    String [] words=newstr.split(" "); 
    // removing the space 

    String last_word = words[words.length -1]; // here every word is the array 
// here i m finding out the word

    return last_word.length(); // length of last word 

        
    }
}
