package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PascalTriangle {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NnKStr = br.readLine().split(" ");
        int N = Integer.parseInt(NnKStr[0]);
        int k = Integer.parseInt(NnKStr[1]);

        int[][] dp = new int[31][31];
        dp[0][0]=1;

        for(int i=1; i<31; i++){
            dp[i][i] = 1; dp[i][0]=1;
        }

        for(int i=2; i<31; i++){
            for(int j=1; j<i; j++){
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        System.out.println(dp[N-1][k-1]);
    }
}
