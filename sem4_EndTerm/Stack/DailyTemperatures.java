class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            while(!st.isEmpty() && t[st.peek()] < t[i]){
                res[st.peek()] = i - st.pop();
            }
            st.push(i);
        }
        return res;
    }
}
