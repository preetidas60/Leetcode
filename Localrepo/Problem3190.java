public class Problem3190 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 6, 5, 8};
        int result = minimumOperations(nums);
        System.out.println("Minimum operations needed: " + result);
    }

    public static int minimumOperations(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 3 != 0){
                count++;
            }
        }
        return count;
    }
}
