package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BABBA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        String[] dp = new String[46];

        dp[0] ="A"; dp[1] = "B"; dp[2] = "BA";

        for(int i =3; i<=K; i++) dp[i] = dp[i-1].replace("A","C").replace("B","BA").replace("C","B");

        System.out.println(dp[K].replace("B","").length()+ " " + dp[K].replace("A","").length());

    }
}
