package Solutions;

public class s_1351_Count_Negative_Numbers_In_A_Sorted_Matrix {

    public int countNegatives(int[][] grid){
//        --------------------
//                T(O) - N*N
//        --------------------
//        int count =0;
//        if(grid !=null) {
//            for (int i = 0; i < grid.length; i++) {
//                for (int j = 0; j < grid[i].length; j++) {
//                    if (grid[i][j] < 0) {
//                        count++;
//                    }
//                }
//            }
//        }
//        return count;
//        ---------------------

        int row = grid.length-1;
        int col = 0;
        int col_length = grid[0].length;
        int count = 0;
        while(row>=0 && col<col_length){
            if(grid[row][col]<0){
                count+= (col_length-col);
                row--;
            }else{
                col++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        s_1351_Count_Negative_Numbers_In_A_Sorted_Matrix s = new s_1351_Count_Negative_Numbers_In_A_Sorted_Matrix();
//        int[][] grid = {{5,1,0},{-5,-5,-5}};
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int count = s.countNegatives(grid);
        System.out.println(count);
    }
}
