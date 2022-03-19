import java.util.*;

public class Question2 {

    private static int minimumHours(int rows, int columns, List<List<Integer> > grid)
    {
        // WRITE YOUR CODE HERE
        Integer[][] array = grid.stream()
                .map(l -> l.stream().toArray(Integer[]::new))
                .toArray(Integer[][]::new);

        return minimumHours(array);
    }

    private static int minimumHours(Integer [][] grid)
    {
        Queue<int[]> q = new LinkedList<>();
        int target = grid.length * grid[0].length;
        int cnt = 0, res = 0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j] == 1) {
                    q.offer(new int[] {i,j});
                    cnt++;
                }
            }
        }
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while(!q.isEmpty()) {
            int size = q.size();
            if(cnt == target)
                return res;
            for(int i=0;i<size;i++) {
                int[] cur = q.poll();
                for(int[] dir : dirs) {
                    int ni = cur[0] + dir[0];
                    int nj = cur[1] + dir[1];
                    if(ni >=0 && ni < grid.length && nj >=0 && nj < grid[0].length && grid[ni][nj] == 0) {
                        cnt++;
                        q.offer(new int[] {ni, nj});
                        grid[ni][nj] = 1;
                    }
                }
            }
            res++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int rows=4;
        int column=5;

        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(0,1,1,0,1));
        grid.add(Arrays.asList(0,1,0,1,0));
        grid.add(Arrays.asList(0,0,0,0,1));
        grid.add(Arrays.asList(0,1,0,0,1));
        int result = minimumHours(rows,column,grid);
        System.out.println(String.format("%s (expect 3)", result));
    }
}
