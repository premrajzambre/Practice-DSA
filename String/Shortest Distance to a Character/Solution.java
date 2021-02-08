import java.util.*;
class Solution {
    public int[] shortestToChar(String s, char c) {
        //char[] ch = s.toCharArray();
        int arr[] = new int[s.length()];
        int count = -0x3f3f3f3f;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                count = i;
            }
            arr[i] = i - count;
        }
        
        count = 0x3f3f3f3f;
        for(int i=s.length()-1; i>=0; i--){
           if(s.charAt(i) == c){
                count = i;
            }
            arr[i] = Math.min(arr[i], count - i);
        }
        return arr;
    }
}