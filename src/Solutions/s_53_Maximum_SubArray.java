package Solutions;

import com.sun.deploy.util.StringUtils;

public class s_53_Maximum_SubArray {

    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length-1;i++){
            int tmp  = nums[i];
            for(int j=i+1;j<=nums.length-1;j++){
                tmp +=nums[j];
//                tmp = Math.abs(tmp);
                if(tmp > max){
                    max = tmp;
                }// if
            }// inner for
        }// outer for
        return Math.abs(max);
//        class Solution {
//            public int maxSubArray(int[] nums) {
//                if(nums.length==1)
//                    return nums[0];
//                else
//                    return sort(nums,0,nums.length-1);
//            }
//
//            public int sort(int[] nums,int l, int r){
//                int max=0;
//                int sum=0;
//                if(l<r){
//                    int m = (l+r)/2;
//                    sort(nums,l,m);
//                    sort(nums,m+1,r);
//                    merge(nums,l,m,r);
//
//                    for(int i=0;i<r;i++){
//                        sum = sum+nums[i];
//                        if(sum>max)
//                            max = sum;
//                    }
//                }
//                return max;
//            }
//
//            public void merge(int[] nums, int l, int m, int r){
//                int n1 = m-l+1;
//                int n2 = r-m;
//                int[] L = new int[n1];
//                int[] R = new int[n2];
//
//                for(int i=0; i<n1;i++)
//                    L[i]=nums[l+i];
//                for(int j=0;j<n2;j++)
//                    R[j]=nums[m+1+j];
//                int i=0;
//                int j=0;
//                int k=0;
//                while(i<n1 && j<n2){
//                    if(L[i]<R[i]){
//                        nums[k]=L[i];
//                        i++;
//                    }else {
//                        nums[k]=R[j];
//                        j++;
//                    }
//                    k++;
//                }
//                while(i<n1){
//                    nums[i]=L[i];
//                    i++;
//                    k++;
//                }
//                while(j<n2){
//                    nums[j]=R[j];
//                    j++;
//                    k++;
//                }
//            }
//        }

    }

    public static void main(String[] args) {
        s_53_Maximum_SubArray s_53_maximum_subArray = new s_53_Maximum_SubArray();
        int arr[] = {-2,-1};
        System.out.println(s_53_maximum_subArray.maxSubArray(arr));
    }
}
