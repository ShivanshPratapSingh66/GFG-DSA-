class Solution {
    public void sort012(int[] arr) {
        // code here
        int st=0,mid=0,end=arr.length-1;
        while(mid<=end)
        {
            if(arr[mid]==0)
            {swap(arr,st++,mid++);}
            else if(arr[mid]==2)
            {swap(arr,mid,end--);}
            else
            mid++;
        }
    }
    public void swap(int[] num,int a,int b)
    {
        int temp=num[a];
        num[a]=num[b];
        num[b]=temp;
        
    }
}
