import java.util.ArrayList;
import java.util.List;

public class Q229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int element1 = Integer.MIN_VALUE, count1=0;
        int element2 = Integer.MIN_VALUE, count2=0;
        for(int i=0; i<nums.length; i++){
            if(count1 == 0 && nums[i]!= element2){
                element1 = nums[i];
                count1 =1;
            }
            else if(count2 == 0 && nums[i]!= element1){
                element2 = nums[i];
                count2 =1;
            }
            else if(nums[i] == element1){
                count1++;
            }
            else if(nums[i] == element2){
                count2++;
            }
            else {
                count1--; count2--; 
            }
        }
        count1=0; count2=0;
        for(int i=0; i<nums.length; i++){
            if(element1 == nums[i]) count1++;
            if(element2 == nums[i]) count2++;
        }
        if(count1 > nums.length/3) list.add(element1);
        if(count2 > nums.length/3) list.add(element2);
        return list;
    }
}
