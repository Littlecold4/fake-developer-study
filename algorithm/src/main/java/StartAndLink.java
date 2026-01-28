import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartAndLink {
    static int N;
    static int[][] S;
    static boolean[] visited;
    static int minDiff = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        S = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            String[] Sstr = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                S[i][j] = Integer.parseInt(Sstr[j]);
            }
        }

        dfs(0, 0);

        System.out.println(minDiff);
    }


    static void dfs(int startIdx, int count) {
        if (count == N / 2) {
            calculateScore();
            return;
        }
        if (startIdx == N) return;

        visited[startIdx] = true;
        dfs(startIdx + 1, count + 1);

        visited[startIdx] = false;
        dfs(startIdx + 1, count);
    }

    static void calculateScore() {
        int startTeamScore = 0;
        int linkTeamScore = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i] == true && visited[j] == true) {
                    startTeamScore += S[i][j];
                } else if (visited[i] == false && visited[j] == false) {
                    linkTeamScore += S[i][j];
                }
            }
        }

        int diff = Math.abs(startTeamScore - linkTeamScore);

        if (diff < minDiff) {
            minDiff = diff;
        }

        if (minDiff == 0) {
            System.out.println(0);
            System.exit(0);
        }
    }
}