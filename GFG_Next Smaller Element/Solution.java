class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            int a = arr[i];
            while(!st.isEmpty() && st.peek()>=a)
            {
                st.pop();
            }
            if(st.isEmpty())
            arr[i]=-1;
            else
            arr[i]=st.peek();
            st.push(a);
        }
        ArrayList<Integer> list = new ArrayList<>()
;

        for(int a: arr){
            list.add(a);
        }
        return list;
    }
}
