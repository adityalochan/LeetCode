package Solutions;

public class s1470_Shuffle_The_Array {
    public int[] shuffle(int[] nums, int n) {
//        int arr_final[] = new int[nums.length];
//        int arr1[] = new int[n];
//        int arr2[] = new int[nums.length-n];
//        int c1 = 0;
//        int c2 = 0;
//        int d1 = 0;
//        int d2 = 0;
//        for(int i=0;i<nums.length;i++) {
//            if (i < n) {;
//                arr1[c1] = nums[i];
//                c1++;
//            } else {
//                arr2[c2] = nums[i];
//                c2++;
//            }
//        }
//        for(int i=0;i<nums.length;i++){
//            if(i%2==0){
//                arr_final[i] = arr1[d1];
//                d1++;
//            } else {
//                arr_final[i] = arr2[d2];
//                d2++;
//            }
//        }
//        return arr_final;
        int[] arr_final = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                arr_final[i] = nums[i/2];
            } else {
                arr_final[i] = nums[n+ (i/2)];
            }
        }
        return arr_final;

    }
    public static void main(String[] args) {
        s1470_Shuffle_The_Array s = new s1470_Shuffle_The_Array();
        int nums[] = {2,5,1,3,4,7};
        int result[] = s.shuffle(nums,3);

        for(int i=0; i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
