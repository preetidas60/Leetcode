public class Q485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cons = 0;
        int max =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                cons++;
                max = Math.max(max, cons);
            }
            else cons = 0;
        }
        return max;
    }
}
