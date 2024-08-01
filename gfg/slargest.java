package gfg;
import java.util.List;;
public class slargest{
    public int print2largest(List<Integer> arr) {
        // Code Here
        int largest = arr.get(0);
        int slargest = -1;
        for(int num : arr){
            if(num > largest){
                slargest = largest;
                largest = num;
            }
            else if(num < largest && num > slargest){
                slargest = num;
            }
        }
        return slargest;
    }
}