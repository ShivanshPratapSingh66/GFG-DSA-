import java.util.*;
class Solution {
    public int findPages(int[] arr, int k) {
        if(k>arr.length) return -1;
        int end=0,st=0;
        for(int a:arr)
        {  st=Math.max(a,st);
            end+=a;
        }int ans=-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(isValid(arr,mid,k))
             { end=mid-1;  //left
                 ans=mid;  
             }
              else
              {
                  st=mid+1;  //right
                  
              }
        }
        return ans;
        
        
    }
    public static boolean isValid(int[] num,int mid,int Tstu)
    {
        int len=num.length;
        int stu=1,page=0;
        for(int i=0;i<len;i++)
        {
            if(num[i]>mid) return false;
            if(page+num[i]<=mid)
              page+=num[i];
              else
              {
                  page=num[i];
                  stu++;
              }
             
        }
        if(stu<=Tstu)
        return true;
        else
        return false;
    }
}
