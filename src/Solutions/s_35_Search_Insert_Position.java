package Solutions;

public class s_35_Search_Insert_Position {

	   public int searchInsert(int[] arr, int target) {
	        int l =0;
	        int r = arr.length-1;
	        while(l<=r){
	            int mid = l + ((r-l)/2);
	        	if(target == arr[mid])
	            	return mid;
	            if(target < arr[mid])
	                r = mid;
	            else if(target > arr[mid])
	                l = mid+1;
	            }
	        return l;
	        }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,6};
		int target = 4;
		s_35_Search_Insert_Position s = new s_35_Search_Insert_Position();
		System.out.println(s.searchInsert(arr, target));
	}

}
