package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Change {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[100001];
        dp[0] = -1; dp[1] =-1; dp[2] =1 ;dp[3] =-1; dp[4] =2; dp[5] =1;

        for(int i=6; i<=n; i++){
            if(dp[i-2]!=-1 &&dp[i-5]!=-1) dp[i]= Math.min(dp[i-2],dp[i-5]) +1;
            else if(dp[i-2]==-1&&dp[i-5]!=-1) dp[i] = dp[i-5]+1;
            else if(dp[i-2]!=-1&&dp[i-5]==-1) dp[i] = dp[i-2]+1;

//            System.out.println("dp["+i+"] = " +dp[i]);
        }
        System.out.println(dp[n]);
    }
}
