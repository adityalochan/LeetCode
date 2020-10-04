package Contest;

import java.lang.reflect.Array;
import java.util.*;

public class Target_Array_In_Given_Order_5364 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] arr = new int[nums.length];
        List<Integer> hm = new ArrayList();
        for(int i=0; i<nums.length;i++){
            hm.add(index[i],nums[i]);
        }
        for(int j=0; j<hm.size();j++){
            arr[j] = hm.get(j);
        }
        return arr;
    }
    public static void main (String args[]){
        Target_Array_In_Given_Order_5364  s = new Target_Array_In_Given_Order_5364();
        int[] num = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] result = s.createTargetArray(num,index);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]+ "\n");
        }
    }
}
