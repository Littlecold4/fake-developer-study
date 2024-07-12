package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Move {
    static int N;
    static int M;
    static int[][] map;
    static int[][] dp;

    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] NnMStr = br.readLine().split(" ");
        N = Integer.parseInt(NnMStr[0]);
        M = Integer.parseInt(NnMStr[1]);
        map = new int[N][M];
        dp = new int[N][M];

        for(int i=0; i<N; i++){
            String[] NumStr = br.readLine().split(" ");
            for(int j=0; j<M;j++){
                map[i][j] = Integer.parseInt(NumStr[j]);
            }
        }

        dp[0][0] = map[0][0];
        for(int i=1; i<N; i++){
            dp[i][0] =dp[i-1][0]+ map[i][0];
        }
        for(int i=1; i<M; i++){
            dp[0][i] = dp[0][i-1]+map[0][i];
        }

        for(int i = 1 ; i<N; i++){
            for(int j=1; j<M; j++){
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])+map[i][j];
            }
        }

        System.out.println(dp[N-1][M-1]);
    }
}
