class Solution {
    int countFreq(int[] arr, int target) {
        int count=0;
        for(int a: arr)
        {
            if(a==target)
            count++;
        }
        return count;
    }
}
