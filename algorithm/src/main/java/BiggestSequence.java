import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BiggestSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N];
        int[] nums = new int[N];
        String[] numStr = br.readLine().split(" ");

        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(numStr[i]);
            dp[i] = nums[i];
        }
        int answer = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++){
                if(nums[i]>nums[j]) dp[i] = Math.max(dp[j] + nums[i] , dp[i]);
            }
            answer = Math.max(answer,dp[i]);
        }
        System.out.println(answer);
    }
}
