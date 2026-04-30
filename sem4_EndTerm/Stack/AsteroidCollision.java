class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int x : asteroids){
            if(x > 0) st.push(x);
            else {
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < -x) st.pop();
                if(st.isEmpty() || st.peek() < 0) st.push(x);
                if(st.peek() == -x) st.pop();
            }
        }
        int[] arr = new int[st.size()];
        int x = st.size() ;
        while(!st.isEmpty()){
            arr[--x] = st.pop();
        }
        return arr;
    }
}
