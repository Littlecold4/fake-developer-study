package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RockGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp =  new int[1000];

        dp[0] = 0; dp[1] = 1; dp[2]= 2;

        for(int i=3; i<=N; i++){
            dp[i] = Math.min(dp[i-1]+1,dp[i-3] +1);
        }

        if (dp[N] %2 ==1 ) System.out.println("SK");
        else System.out.println("CY");

        return;
        }
    }
