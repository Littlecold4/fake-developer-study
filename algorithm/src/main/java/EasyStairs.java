import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EasyStairs {
    static int N;
    static int answer ;
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        if(N==0){
            System.out.println(0);
            return;
        }
        if(N==1){
            System.out.println(9);
            return;
        }
        if(N==2){
            System.out.println(17);
            return;
        }
        long[] dp = new long[N+1];
        dp[0] = 0;
        dp[1] = 9;
        dp[2] = 17;

        for(int i= 3; i<=N;i++){
            dp[i] = 2*dp[i-1]-2;
        }
        System.out.println(dp[N]%1000000000);
    }
}
