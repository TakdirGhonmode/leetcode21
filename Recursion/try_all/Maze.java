import java.util.ArrayList;
import java.util.List;
public class Maze{
    public static void solve(int[][] maze,int row,int col,
        boolean[][] visited,List<String> ans,String path){
     if(row==maze.length-1&&col==maze[0].length-1){
        ans.add(path);
        return;
     }
     //visited path 
     visited[row][col]=true;
     //for the down
     if(row+1 <maze.length&&maze[row+1][col]==1&&!visited[row+1][col]){
        solve(maze,row+1,col,visited,ans,path+'D');
     }
     //for the up
     if(row-1 >=0&&maze[row-1][col]==1&&!visited[row-1][col]){
        solve(maze,row-1,col,visited,ans,path+'U');
     }
     //for the right
     if(col+1 <maze[0].length&&maze[row][col+1]==1&&!visited[row][col+1]){
        solve(maze,row,col+1,visited,ans,path+'R');
     }
     //for the left
     if(col-1 >=maze[0].length-1&&maze[row][col-1]==1&&!visited[row][col-1]){
        solve(maze,row,col-1,visited,ans,path+'L');
     }
     //backtracking
     visited[row][col]=false;
    }
    public static void main(String arg[]){
           int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {0, 1, 1, 1}
        };
        boolean[][] visited =
                new boolean[maze.length][maze[0].length];
        List<String> ans = new ArrayList<>();
        solve(maze, 0, 0, visited,ans, "");
        System.out.println(ans);
    }
}