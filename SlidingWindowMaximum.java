public class Solution {
  public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k) 
	{
		Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.size(); ++i) {
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && nums.get(dq.peekLast()) <= nums.get(i)) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                ans.add(nums.get(dq.peekFirst()));
            }
        }
        return ans;
	}
}
