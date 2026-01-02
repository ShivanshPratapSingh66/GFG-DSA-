class Solution {
    int floorSqrt(int n) {
        // code here
        int st=1,end=n;
        int mid=1+(n-1)/2;
        int pans=0;
        while(st<=end)
        {
            mid=st+(end-st)/2;
            if(mid*mid==n) return mid;
         if(mid*mid<n)
           { st=mid+1;
               pans=mid;
           }
            else
            end=mid-1;
        }
        return pans;
    }
}
