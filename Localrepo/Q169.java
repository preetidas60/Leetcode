public class Q169 {
    public int majorityElement(int[] nums) {
        int element = nums[0];
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                element = nums[i];
                count =1;
            }
            else if(nums[i] == element){
                count++;
            }
            else count--; 
        }
        int count1=0;
        for(int i=0; i<nums.length; i++){
            if(element == nums[i]){
                count1++;
            }
        }
        if(count1 > nums.length/2){
            return element;
        }
        return -1;
    }
}
