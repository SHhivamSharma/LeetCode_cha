///1328. Break a Palindrome

class Solution {
     public String breakPalindrome(String palindrome) {
        int len = palindrome.length();
        if(len==1)
             return "";
     char arr[]= palindrome.toCharArray();
        boolean flag =true;
        for(int i =0;i<arr.length/2;i++){
            if(arr[i]!='a'){
                arr[i]='a';
                flag  = false;
                break;
            }
        }
        if(flag){
            arr[len-1]= 'b';
        }
        return String.valueOf(arr);      
    }
}