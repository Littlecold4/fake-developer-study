package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusOneTwoThree {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] dp = new int[13];
        dp[0] = 0; dp[1] = 1; dp[2] =2; dp[3] =4;
        for(int i=4 ; i<11; i++){
            dp[i] = dp[i-1] + dp[i-2]*2 + dp[i-3]*3;
            System.out.println(dp[i]);
        }

        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            System.out.println(dp[N]);
        }
        //결과 오류
    }
}
