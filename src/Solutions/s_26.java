package Solutions;

import java.util.Arrays;

public class s_26 {
	
	public int removeDuplicates(int[] nums) {
		Arrays.sort(nums);
		int count = nums.length;
		int rep=0;
		for(int i=1; i<nums.length-1;i++){
			if(nums[i] == nums[i-1]){
				nums[i] = nums[i+1];
				rep++;
				count--;
			}
			if(nums[i] !=nums[i+1])
				rep++;
			if(rep >=2)
				count--;
		}
		return count;
//		int i=0;
//        while(i < nums.length){
//             if(nums[i] == nums[i+1]){
//                 nums[i+1] = nums[i+2];
//                 System.out.println(nums[i]);
//                 i++;
//             }else   
//            	 System.out.println(nums[i]);;
//        }
//		return nums[i];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s_26 s = new s_26();
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(s.removeDuplicates(nums));
	}

}
