package Solutions;

public class s_27_RemoveElement {

	public int removeElement(int[] nums, int val) {
		int i =0;
		for(int j=0; j<nums.length; j++){
			if(nums[j] != val){
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s_27_RemoveElement s = new s_27_RemoveElement();
		int val = 2;
		int[] arr = { 0, 1, 2, 2, 3, 0, 4, 2 };
		System.out.println(s.removeElement(arr, val));
	}

}
