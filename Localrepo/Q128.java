import java.util.HashSet;
import java.util.Set;

public class Q128 {
    public int longestConsecutive(int[] nums) {
        int longest =1;
        Set<Integer> set = new HashSet<>();
        if (nums.length == 0) return 0;
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        for(int i : set){
            if(!set.contains(i-1)){
                int count = 1;
                int x = i;
                while(set.contains(x+1)){
                    count++;
                    x++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
