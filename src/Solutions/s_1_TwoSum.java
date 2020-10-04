package Solutions;

public class s_1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
//        int i = 0;
//        int a = nums[i];
//        for (int j = i + 1; j < nums.length; j++) {
//        for (int i=0; i<nums.length; i++) {
//            if (nums[j] == target - nums[i]) {
//                return new int[]{i, j};
//            }
//        }
        return null;
    }

    public static void main(String[] args) {
        s_1_TwoSum s1 = new s_1_TwoSum();
        int[] arr = {3,0,3};
        int[] result = s1.twoSum(arr, 6);
        System.out.println("first index: " + result[0] + "---second index: "+ result[1]);
    }
}
