class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length()!=s2.length())
        return false;
        // code here
        int[] arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] arr1 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<s1.length();i++)
        {
            arr[(int)s1.charAt(i)-97]++;
            arr1[(int)s2.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=arr1[i])
            return false;
        }
        return true;
       
    }
}
