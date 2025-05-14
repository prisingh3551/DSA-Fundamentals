class Solution {
    public int maxSubArraySum(int arr[]) {
        int currSum = 0, maxSum = 0;
        for(int i = 0; i < arr.length; ++i) {
            currSum += arr[i];
            if(currSum > maxSum) {
                maxSum = currSum;
            }
            if(currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
