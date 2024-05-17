package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Upstairs {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] scores = new int[N+2]; scores[0] =0;
        for(int i=1; i<=N; i++){
            scores[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[N+2];
        dp[0] =scores[0]; dp[1] = scores[1]; dp[2] = scores[1]+scores[2];


        for(int i=3; i<=N; i++){
            dp[i] = Math.max(dp[i-2],dp[i-3]+scores[i-1])+scores[i];
        }
        System.out.println(dp[N]);
    }
}
