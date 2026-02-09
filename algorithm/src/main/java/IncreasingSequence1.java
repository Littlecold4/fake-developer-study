import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IncreasingSequence1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        int[] dp = new int[N];
        String[] numStr = br.readLine().split(" ");

        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(numStr[i]);
            dp[i] =1;
        }
        int answer = 0;

        for(int i=0; i<N; i++){
            for(int j=0 ;j<i; j++){
                if(nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp[j]+1);
            }
            answer = Math.max(answer,dp[i]);
        }
        System.out.println(answer);
    }
}
