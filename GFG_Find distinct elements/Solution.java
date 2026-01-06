
class Solution {
    static int distinct(int arr[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        // set store all unique values 
        for(int a : arr)
        {
            set.add(a);
        }
        return set.size();
    }
}
