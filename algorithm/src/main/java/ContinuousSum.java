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
        int[] dpSum = new int[n];
        int[] dp = new int[n];
        for(int i =0; i<n; i++){
            Num[i] = Integer.parseInt(NumStr[i]);
        }

        for(int i=0; i<n; i++){
            dpSum[i] = Num[i];
            dp[i] = Num[i];
            for(int j=i+1 ; j<n;j++){
                dp[j] = dp[j-1] +Num[j];
                if(dp[j]>dpSum[i]) dpSum[i] = dp[j];
            }
        }
        System.out.println(Arrays.stream(dpSum).max().getAsInt());
    }
}
