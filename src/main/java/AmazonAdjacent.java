import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class AmazonAdjacent
{


    private   int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public   int numIslands( int row , int column, List<List<Integer>>  data) {
        Integer[][] grid = data.stream()
                .map(l -> l.stream().toArray(Integer[]::new))
                .toArray(Integer[][]::new);

        int count = 0;

        if (row == 0) return 0;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++)
                if (grid[i][j] == 1) {
                    markAdjacentIsland(grid, i, row,j,column);
                    ++count;
                }
        }
        return count;
    }

    private   void markAdjacentIsland(Integer[][] grid, int i,int row, int j , int column) {
        if (i < 0 || j < 0 || i >= row || j >= column || grid[i][j] != 1)
            return;
        grid[i][j] = 0;
        for(int [] dir : dirs)
        {
            int newI=i+dir[0];
            int newJ=j+dir[1];
            markAdjacentIsland(grid, newI ,row,newJ,column);
        }


    }

    public static void main(String[] args) {
        int rows=5;
        int column=4;

        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1,1,0,0));
        grid.add(Arrays.asList(0,0,1,0));
        grid.add(Arrays.asList(0,0,0,0));
        grid.add(Arrays.asList(1,0,1,1));
        grid.add(Arrays.asList(1,1,1,1));

        int result = (new AmazonAdjacent()).numIslands(rows,column,grid);
        System.out.println(String.format("%s (expect 3)", result));
    }

}
