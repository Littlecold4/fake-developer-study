package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n];
        dp[0] = Integer.parseInt(br.readLine());
        if(n == 1) System.out.println(dp[0]);

        String[] input = br.readLine().split(" ");

        dp[1] = dp[0] + Integer.parseInt(input[1]);
        dp[0] = dp[0] + Integer.parseInt(input[0]);

        print(dp);

        for(int i = 2; i<n; i++){
            input = br.readLine().split(" ");
            dp[i] = Integer.parseInt(input[i])+dp[i-1];
            for(int j=i-1 ; j>=1 ;j--){
                dp[j] = Math.max(dp[j],dp[j-1])+Integer.parseInt(input[j]);
            }
            dp[0] = dp[0]+Integer.parseInt(input[0]);
            print(dp);
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
    private static void print(int[] dp){
        for(int i=0; i<dp.length; i++){
            System.out.printf(dp[i]+ " ");
        }
            System.out.println();
    }
}
