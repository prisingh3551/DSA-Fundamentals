class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length, maxArea = Integer.MIN_VALUE;
        for(int i = 0; i < n; ++i) {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                int ele = st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1: st.peek();
                maxArea = Math.max(maxArea, heights[ele] * (nse - pse - 1));
            }
            st.push(i);
        }
        while(!st.isEmpty()) {
            int ele = st.pop();
            int nse = n;
            int pse = st.isEmpty()? -1: st.peek();
            maxArea = Math.max(maxArea, heights[ele] * (nse - pse - 1));
        }
        return maxArea;
    }
}
