class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        int sMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                sMax=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>sMax)
            {
                sMax=arr[i];
            }
        }
        return sMax;
    }
}
