/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> topView(Node root) {
        // code here
        TreeMap<Integer,Obj> map = new TreeMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
      
        solve(map,root,0,0);
        for(int a : map.keySet())
        {
            ans.add(map.get(a).val);
        }
        return ans;
    }
    public static void solve(TreeMap<Integer,Obj>mp,Node root,int hd,int level){
        if(root==null)
        return ;
        if(! mp.containsKey(hd) || level<mp.get(hd).level)
        mp.put(hd,new Obj(root.data,level));
        solve(mp,root.left,hd-1,level+1);
        solve(mp,root.right,hd+1,level+1);
        
    }
}
class Obj{
    int level;
    int val;
    public Obj(int val,int level){
        this.level=level;
        this.val=val;
        
    }
}
