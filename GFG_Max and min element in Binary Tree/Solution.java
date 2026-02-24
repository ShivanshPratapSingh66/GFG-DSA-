/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    static int min,max;
    public static int findMax(Node root) {
        // code here
          if(root==null)
        return 0;
       max=Integer.MIN_VALUE;
      solvemax(root);
      return max;
       
    }
    public static void solvemax(Node root){
        if(root==null)
        return;
        max=Math.max(root.data,max);
        solvemax(root.left);
        solvemax(root.right);
    }

    public static int findMin(Node root) {
        
        // code here
          if(root==null)
        return 0;
         min= Integer.MAX_VALUE;
        solvemin(root);
        return min;
    }
    public static void solvemin(Node root){
        if(root==null)
        return;
        min=Math.min(root.data,min);
        solvemin(root.left);
        solvemin(root.right);
}
}
