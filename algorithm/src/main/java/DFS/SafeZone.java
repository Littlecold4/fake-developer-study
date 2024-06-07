package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SafeZone {

    static int[][] heights;
    static int N;
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        heights = new int[N][N];

        int ans = 0;
        int rainHeight = 0;

        for(int i =0 ;i<N; i++){
            String[] input = br.readLine().split(" ");
            for(int j= 0 ; j<N; j++){
                heights[i][j] = Integer.parseInt(input[j]);
             }
        }

        while(true){
            int safeZone = 0;
            boolean[][] check = new boolean[N][N];
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(heights[i][j]<= rainHeight){
                        check[i][j] =true;
                        continue;
                    }
                    if(!check[i][j]){
                        safeZone++;
                        DFS(check,i,j,rainHeight);
                    }
                }
            }
            if(rainHeight==100) break;
            rainHeight++;
            if(safeZone>ans) ans=safeZone;

        }
        System.out.println(ans);
    }
    private static void DFS( boolean[][] check, int x, int y,int rainHeight){
        check[x][y]=true;
        if(heights[x][y]>rainHeight){
            if(x+1<N)
                if(!check[x+1][y]) DFS(check,x+1,y,rainHeight);
            if(y+1<N)
                if(!check[x][y+1]) DFS(check,x,y+1,rainHeight);
            if(x-1>=0)
                if(!check[x-1][y]) DFS(check,x-1,y,rainHeight);
            if(y-1>=0)
                if(!check[x][y-1]) DFS(check,x,y-1,rainHeight);
        }
    }
}
