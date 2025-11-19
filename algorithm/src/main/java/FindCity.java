import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindCity {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] NnMnKnXStr = br.readLine().split(" ");
        int N =Integer.parseInt(NnMnKnXStr[0]);
        int M =Integer.parseInt(NnMnKnXStr[1]);
        int K =Integer.parseInt(NnMnKnXStr[2]);
        int X =Integer.parseInt(NnMnKnXStr[3]);

        dp = new int[N];
        dp[X-1] = 0;

        boolean[][] streets = new boolean[N][N];
        for(int i=0; i<M; i++){
            String[] xnyStr = br.readLine().split(" ");
            int y = Integer.parseInt(xnyStr[0]);
            int x = Integer.parseInt(xnyStr[1]);

            streets[x-1][y-1] = true;
            streets[y-1][x-1] = true;
        }
    }
}
