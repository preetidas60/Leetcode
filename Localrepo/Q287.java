import java.util.Arrays;

public class Q287 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int num=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                num = nums[i];
            }
        }
        return num;
    }
}
