import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ContinuousSum {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] NumStr = br.readLine().split(" ");

        int[] Num = new int[n];
        int[] dp = new int[n];
        for(int i =0; i<n; i++){
            Num[i] = Integer.parseInt(NumStr[i]);
        }
        dp[0] = Num[0];

        for(int i=1; i<n; i++){
            if(dp[i-1]+Num[i]>Num[i]) dp[i] = dp[i-1] + Num[i];
            else dp[i] = Num[i];
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
