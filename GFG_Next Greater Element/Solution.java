class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
          int a =-1;
        for(int i=arr.length-1;i>=0;i--)
            { a= arr[i];
            while(!st.isEmpty() && st.peek()<=a){
                st.pop();
            }
            if(st.isEmpty())
            arr[i]=-1;
            else
            arr[i]=st.peek();
            
            st.push(a);}
        
        ArrayList<Integer> list = new ArrayList<>();
            for (int x : arr) {
            list.add(x);
            }
            return list;
   
        }
}
