package Solutions;

public class s_1295_Find_Numbers_with_Even_Number_of_Digits {
    public int findNumbers(int[] nums){
        int digit_count = 0;
        int even_count = 0;
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            while(temp>0){
                temp = temp/10;
                digit_count++;
            }
            if(digit_count%2==0){
                even_count++;
            }
            digit_count =0;
        }

        return even_count;
    }

    public static void main(String[] args) {
        s_1295_Find_Numbers_with_Even_Number_of_Digits s = new s_1295_Find_Numbers_with_Even_Number_of_Digits();
        int[] nums = {12,345,2,6,7896};
        System.out.println(s.findNumbers(nums));
    }
}
