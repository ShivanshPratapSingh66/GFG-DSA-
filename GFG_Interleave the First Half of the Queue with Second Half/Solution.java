class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue<Integer> q1 = new LinkedList<>();
        int size= q.size()/2;
        while(size-->0)
        {
            q1.add(q.peek());
            q.remove();
            
        }
        while(!q1.isEmpty())
        {
            q.add(q1.peek());
            q1.remove();
            q.add(q.peek());
            q.remove();
            
        }
    }
}
