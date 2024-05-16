package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PutinBox {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] boxes =new int[n];

        int[] dp = new int[n];
        Arrays.fill(dp,1);

        String[] boxesStr = br.readLine().split(" ");

        for(int i=0; i<n; i++){
            boxes[i] = Integer.parseInt(boxesStr[i]);
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(boxes[i]>boxes[j]) dp[i] = Math.max(dp[i],dp[j]+1);
            }
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
