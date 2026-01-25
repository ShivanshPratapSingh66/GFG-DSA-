
import java.util.*;
class Solution {
    public char nonRepeatingChar(String s) {
        
        int freq[] = new int[26];
        boolean flag=false;
          char ch='$';
        Arrays.fill(freq,0);
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
       { 
           if(  freq[s.charAt(i)-'a']==1)
        {
          return s.charAt(i);
           
          
        }
       
       }
       return '$';
       
       
        
        
        
    }
}
