public class Two_sum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[0];
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[0];
    }
    public static void main(String[] args) {
        Two_sum solution = new Two_sum();
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Two Sum Indices: [" + result[0] + ", " + result[1] + "]");
    }
    
}
