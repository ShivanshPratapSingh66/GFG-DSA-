class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        ArrayList<Integer>list = new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
          mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(int i=1;i<=arr.length;i++)
        {
            if(mp.containsKey(i))
             list.add(mp.get(i));
             else
            list.add(0);
            
        }
        return list;
    }
}
