package Contest;

import java.util.Map;

public class Four_Divisors_1390 {
    public int sumFourDivisors(int[] nums) {
        int total = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            int count = 0;
            for(int j=1;j<=nums[i];j++){
                int num = nums[i];
                if((num%j)==0){
                    sum = sum+j;
                    count++;
                }
            }
            if(count==4){
                total=total+sum;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Four_Divisors_1390 f = new Four_Divisors_1390();
        int[] nums = {21,4,7};
        int sum = f.sumFourDivisors(nums);
        System.out.println(sum);
//        System.out.println(21%3);
    }
}
