import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 곡의 개수
        int s = Integer.parseInt(st.nextToken()); // 시작 볼륨
        int m = Integer.parseInt(st.nextToken()); // 최대 볼륨

        int[] v = new int[n]; // 각 곡의 볼륨 차이
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(st.nextToken());
        }

        // dp[i][j] : i번째 곡을 볼륨 j로 연주할 수 있는지 여부 (true/false)
        boolean[][] dp = new boolean[n + 1][m + 1];

        // 시작 볼륨 설정
        dp[0][s] = true;

        for (int i = 1; i <= n; i++) {
            boolean canPlay = false;
            for (int j = 0; j <= m; j++) {
                if (dp[i - 1][j]) {
                    // 볼륨을 키우는 경우
                    if (j + v[i - 1] <= m) {
                        dp[i][j + v[i - 1]] = true;
                        canPlay = true;
                    }
                    // 볼륨을 줄이는 경우
                    if (j - v[i - 1] >= 0) {
                        dp[i][j - v[i - 1]] = true;
                        canPlay = true;
                    }
                }
            }
            // 만약 중간에 어떤 볼륨으로도 조절할 수 없다면
            if (!canPlay) {
                System.out.println("-1");
                return;
            }
        }

        // 마지막 곡(n번째)에서 가능한 최대 볼륨 찾기
        int maxVolume = -1;
        for (int i = m; i >= 0; i--) {
            if (dp[n][i]) {
                maxVolume = i;
                break;
            }
        }

        System.out.println(maxVolume);
    }
}
