package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.LinkedList;

public class HowManyIsland {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] around = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        StringBuffer sb = new StringBuffer();
        while(true){
            int result = 0;
            String[] bigStr  = br.readLine().split(" ");
            Queue<int[]> queue = new LinkedList<>();
            HashSet<int[]> set = new HashSet<>();
            int height = Integer.parseInt(bigStr[1]);
            int width = Integer.parseInt(bigStr[0]);
            if(height==0 &&width==0) {
                System.out.println(sb);
                return;
            }
            int[][] big = new int[height][width];
            for(int i=0; i<height; i++){
                String[] widthStr = br.readLine().split(" ");
                for(int j=0; j<width; j++){
                    big[i][j] = Integer.parseInt(widthStr[j]);
                }
            }
            int[] start = {0,0};
            queue.add(start);
            set.add(start);
            for(int y=0; y<height; y++){
                for(int x=0; x<width; x++){
                    if(big[y][x] ==1){
                        result++;
                        int[] temp = {y,x};
                        queue.add(temp);
                        big[y][x] =0;
                        while(queue.size()!=0){
                            int[] temp2 = queue.poll();
                            for(int i=0; i<around.length; i++){
                                bfs(temp2[1],temp2[0],around[i],big,queue,set,height,width);
                            }
                        }
                    }
                }
            }
            sb.append(result).append("\n");
        }
    }
    public static void  bfs(int x, int y,int[] position,int[][] big,Queue<int[]> queue,HashSet<int[]> set,int height,int width){
        int ax =x+ position[1];
        int ay =y+position[0];
        int[] temp ={ay,ax};
        if(ax<0 ||ay<0||ax>width-1 || ay>height-1) return;
        if(big[ay][ax] ==1&&!set.contains(temp)){
            big[ay][ax]=0;
            queue.add(temp);
            set.add(temp);
        }
        return;
    }
}
