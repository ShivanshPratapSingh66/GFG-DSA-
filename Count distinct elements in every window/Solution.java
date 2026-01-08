class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        list.add(map.size());
        int j=0;
        for(int i=k;i<arr.length;i++)
        {
          
             map.put(arr[j],map.getOrDefault(arr[j],0)-1);
           if(map.get(arr[j])<=0)
           map.remove(arr[j]);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            list.add(map.size());
            j++;
         }
         return list;
    }
}
