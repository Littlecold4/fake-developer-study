import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int[] stocks = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int n = 0; n < N; n++) {
                stocks[n] = Integer.parseInt(st.nextToken());
            }

            long totalProfit = 0;
            int maxPrice = 0;


            for (int i = N - 1; i >= 0; i--) {
                if (stocks[i] > maxPrice) {
                    maxPrice = stocks[i];
                } else {
                    totalProfit += (maxPrice - stocks[i]);
                }
            }
            System.out.println(totalProfit);
        }
    }
}