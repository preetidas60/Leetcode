class Q3158{
    static int duplicateNumbersXOR(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    result ^= nums[i];
                    break;
                }
            }
        }
        return result;
    }
}