import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuyCard2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[N];
        int[] dp = new int[N];
        String[] input = br.readLine().split(" ");

        for(int i=0; i<N;i++){
            cards[i] = Integer.parseInt(input[i]);
            dp[i] = cards[i];
        }

        for(int i=1; i<N;i++){
            for(int j=0; j<i; j++){
                dp[i] = Math.min(dp[i],dp[j]+ cards[i-j-1]);
            }
        }

        System.out.println(dp[N-1]);
    }
}
