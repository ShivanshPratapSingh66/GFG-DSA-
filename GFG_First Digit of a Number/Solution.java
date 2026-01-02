class Solution {
    public static int firstDigit(int n) {
        // code here
        int f;
        while(true)
        {
           f=n%10;
           if(n/10==0)
           return f;
           else
           n/=10;
        }
    }
}
