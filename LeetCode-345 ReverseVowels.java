class Solution {
    public String reverseVowels(String s) {
        // here first of all we create character array 
        char [] arr= s.toCharArray();
        // we will take two pointer
        int left= 0;
        int right= arr.length-1;
        String vowels= "aeiouAEIOU";
        while(left<right){
            // here checking for 2 loop the first one from left to right 
            while(left<right && vowels.indexOf(arr[left])==-1 ){// showing invalid index till not found;
                left++;

            }
// both of the places where arr[left] and arr[right] is placed -1 with considering the only that element 
            // same loop from right hand side 
            while(left<right && vowels.indexOf(arr[right])==-1){// here i m starting from invalid index
            right--;

            }

            char temp = arr[left]; // here character will place because this is a character array 
            arr[left]= arr[right];
            arr[right]= temp;
            left++; // here indexing increases from both end
            right--;

        }
        return new String(arr);
        // converting char array to string

    }
}
