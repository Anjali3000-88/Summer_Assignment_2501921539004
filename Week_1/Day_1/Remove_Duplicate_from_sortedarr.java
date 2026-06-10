public class Remove_Duplicate_from_sortedarr {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }
    public static void main(String[] args) {
        Remove_Duplicate_from_sortedarr solution = new Remove_Duplicate_from_sortedarr();
        int[] nums = {1, 1, 2, 2, 3,4, 4, 4, 5};
        int newLength = solution.removeDuplicates(nums);
        System.out.println("New Length: " + newLength);
        System.out.print("Modified Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    
}
