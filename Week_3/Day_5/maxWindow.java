public class maxWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] res = new int[nums.length - k + 1];
        int j =0;
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for(int i =0; i<nums.length; i++){
            while(!dq.isEmpty() && nums[dq.getLast()] < nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            if(dq.getFirst() + k <= i){
                dq.removeFirst();
            }
            if(i >= k - 1){
                res[j++] = nums[dq.getFirst()];
            }

    }
        return res;
    }
}