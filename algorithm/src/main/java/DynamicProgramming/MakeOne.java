package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeOne {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[10000001];
        dp[1] =0; dp[2] = 1; dp[3] =1; dp[4] =2 ;

        for(int i=5; i<=N; i++){
            if(i % 2 != 0 && i%3 != 0) dp[i] = dp[i-1] +1;
            else if(i % 2 == 0 && i%3 == 0) dp[i] = Math.min(dp[i/3],dp[i/2] )+1;
            else if(i % 2 != 0 && i%3 == 0) dp[i] = Math.min(dp[i/3],dp[i-1] )+1;
            else if(i % 2 == 0 && i%3 != 0) dp[i] = Math.min(dp[i-1],dp[i/2] )+1;
        }

        System.out.println(dp[N]);
    }
}
