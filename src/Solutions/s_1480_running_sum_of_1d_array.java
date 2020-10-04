package Solutions;

public class s_1480_running_sum_of_1d_array {
    public int[] runningSum(int[] nums) {
        int[] runningArray = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                runningArray[i] = nums[0];
            }else {
                runningArray[i] = nums[i] + runningArray[i - 1];
            }
        }
        return runningArray;
    }

    public static void main(String[] args) {
        s_1480_running_sum_of_1d_array s = new s_1480_running_sum_of_1d_array();
        int[] input = {1,2,3,4};
//        System.out.println(input[0]);
        int[] output = s.runningSum(input);
        for(int i=0; i<input.length;i++){
            System.out.println(output[i]);
        }


    }
}
