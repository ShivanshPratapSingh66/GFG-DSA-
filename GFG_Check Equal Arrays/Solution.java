class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        if(a.length!=b.length)
        return false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : a)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : b)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)-1);
                if(map.get(i)==0)
                map.remove(i);
            }
            else
            return false;
        }
        if(map.isEmpty())
        return true;
        else
        return false;
    }
}
