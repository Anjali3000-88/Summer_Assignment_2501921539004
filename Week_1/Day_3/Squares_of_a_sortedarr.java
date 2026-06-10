public class Squares_of_a_sortedarr {
    public int[] sortedSquares(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }

        return result;
    }
    public static void main(String[] args) {
        Squares_of_a_sortedarr solution = new Squares_of_a_sortedarr();
        int[] nums = {1,2,7,9,12};
        int[] result = solution.sortedSquares(nums);
        System.out.print("Squares of a Sorted Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
}
