package Solutions;

import java.util.Arrays;

public class s_1046_LastStoneWeight {

    public int top2WeighingStones(int[] stones) {
        int x = 0;
        int y = 0;
        if (stones.length == 0 || stones.length == 1) {
            return 1;
        }
        Arrays.sort(stones);
        x = stones[stones.length - 2];
        y = stones[stones.length - 1];
        if (x == y)
            return 0;
        else
            return y - x;
    }

    public static void main(String[] args) {
        int[] stones = {3,7,2};
        s_1046_LastStoneWeight s = new s_1046_LastStoneWeight();
        System.out.println(s.top2WeighingStones(stones));

    }
}

//
//S : 1  2 3 4 5
//W : 20 4 8 5 12