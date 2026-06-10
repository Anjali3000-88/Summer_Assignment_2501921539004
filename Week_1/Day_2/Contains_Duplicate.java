public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Contains_Duplicate solution = new Contains_Duplicate();
        int[] nums = {1, 2, 3, 4, 5, 1};
        boolean result = solution.containsDuplicate(nums);
        System.out.println("Contains Duplicate: " + result);
    }
}
