package Solutions;

public class s_771_Jewels_And_Stones {
    public int numJewelsInStones(String J, String S) {
//        --------------------------------------------------------------------
//        // T = O(SJ)
//        // S = O(1)
//        int jewel_size = J.length();
//        int stonesHvJewelCount =0;
//        int tmp =0;
//        while(tmp < jewel_size) {
//            for (int i = 0; i < S.length(); i++) {
//                if (tmp < jewel_size &&  (J.charAt(tmp) == S.charAt(i))) {
//                    stonesHvJewelCount++;
//                } // if
//            } //for
//            tmp++;
//        } // while
//        return stonesHvJewelCount;
//        --------------------------------------------------------------------
        int arr[] = new int[62];
        int result =0;
        for(int i=0;i<S.length();i++){
            arr[S.charAt(i)-'A']+=1;
        }

        for(int j=0;j<J.length();j++){
            result+=arr[J.charAt(j)-'A'];
        }
        return result;
    } // function

    public static void main(String[] args) {
        s_771_Jewels_And_Stones s = new s_771_Jewels_And_Stones();
        int ans1 = s.numJewelsInStones("aA","aAAbbbb");
        int ans2 = s.numJewelsInStones("z","ZZ");
        System.out.println(ans1);
        System.out.println(ans2);
//        System.out.println('a' - 'A');
    }
}
