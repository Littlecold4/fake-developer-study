package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sticker {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t<T; t++){
            int n = Integer.parseInt(br.readLine());
            int[][] stickers = new int[2][5];
            for(int i=0; i<2; i++){
                String[] input= br.readLine().split(" ");
                for(int j=0; j<5; j++){
                    stickers[i][j] = Integer.parseInt(input[j]);
                }
            }
            int[][] dp =new int[2][5];
            dp[0][0] = stickers[0][0];
            dp[1][0] = stickers[1][0];
        }

    }
}
