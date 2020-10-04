package Solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class s_1086_HighFive {
    public int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int[] item : items) {
            int id = item[0];
            int score = item[1];
            if (!map.containsKey(id)) {
                PriorityQueue<Integer> pq = new PriorityQueue<Integer>(5);
                pq.offer(score);
                map.put(id, pq);
            } else {
                PriorityQueue<Integer> pq = map.get(id);
                pq.offer(score);
                if (pq.size() > 5) {
                    pq.poll();
                }
                map.put(id, pq);
            }
        }
        int index = 0;
        int[][] res = new int[map.size()][2];
        for (int id : map.keySet()) {
            res[index][0] = id;
            PriorityQueue<Integer> pq = map.get(id);
            int sum = 0;
            int size = pq.size();
            while (!pq.isEmpty()) {
                sum += pq.poll();
            }
            res[index][1] = sum / size;
            index++;
        }
        return res;
    }
    public static void main(String[] args){
        s_1086_HighFive hf = new s_1086_HighFive();
        int[][] arr = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
        int[][] output = hf.highFive(arr);

        for(int i=0;i<output.length;i++)
            for(int j=0; j<output[i].length;i++){
                System.out.println(output[i][j]);
            }
    }
}
