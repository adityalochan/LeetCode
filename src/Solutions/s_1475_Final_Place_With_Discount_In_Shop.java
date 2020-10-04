package Solutions;

public class s_1475_Final_Place_With_Discount_In_Shop {
    public int[] finalPrices(int[] prices) {
//        int[] result = new int[prices.length];
//        for(int i=0;i<prices.length;i++){
//            for(int j=i+1; j<prices.length;j++){
//                if( prices[j]<=prices[i]){
//                    result[i] = prices[i]- prices[j];
//                }else{
//                    result[i]= prices[i];
//                }
//            }
//        }
//        return result;

//       --------------- LEETCODE SOLUTION-----------------
        int[] result = new int[prices.length];
//        search: for(int i = 0; i < prices.length; i++) {
        search: for(int i = 0; i < prices.length; i++) {
            for(int j = i+1; j < prices.length; j++ ) {
                if(prices[j] <= prices[i]) {
                    result[i] = prices[i] - prices[j];
                    continue search;
                } else {
                    result[i] = prices[i];
                }
            }
            result[prices.length-1] = prices[prices.length-1];
        }
        return result;
    }

    public static void main(String[] args) {
        s_1475_Final_Place_With_Discount_In_Shop s = new s_1475_Final_Place_With_Discount_In_Shop();
        int []arr = new int[]{8,4,6,2,3};
        int []result = s.finalPrices(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(result[i]+ " ");
        }

    }
}
