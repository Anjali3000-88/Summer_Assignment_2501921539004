public class Maximum_Average_Subarray {
    public double findMaxAverage(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            throw new IllegalArgumentException("Input array is null or its length is less than k.");
        }

        double maxAverage = Double.NEGATIVE_INFINITY;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (i >= k - 1) {
                double currentAverage = (double) currentSum / k;
                maxAverage = Math.max(maxAverage, currentAverage);
                currentSum -= nums[i - k + 1];
            }
        }

        return maxAverage;
    }
    public static void main(String[] args) {
        Maximum_Average_Subarray solution = new Maximum_Average_Subarray();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result = solution.findMaxAverage(nums, k);
        System.out.println("Maximum Average Subarray: " + result);
    }
    
}
