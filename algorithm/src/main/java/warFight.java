import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class warFight {
    static String[][] fighters;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NnMStr = br.readLine().split(" ");
        N = Integer.parseInt(NnMStr[0]); // 가로, 열
        M = Integer.parseInt(NnMStr[1]); // 세로, 행

        fighters = new String[M][N];
        visited = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            fighters[i] = br.readLine().split("");
        }

        int Bpower = 0;
        int Wpower = 0;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                int answer = func(fighters[i][j], i, j);

                if (answer != 0) {
                    if (fighters[i][j].equals("B")) {
                        Bpower += answer * answer;
                    } else {
                        Wpower += answer * answer;
                    }
                }
            }
        }

        System.out.println(Wpower + " " + Bpower);
    }

    private static int func(String color, int x, int y) {
        if (x < 0 || x >= M || y < 0 || y >= N) {
            return 0;
        }

        if (visited[x][y] || !color.equals(fighters[x][y])) {
            return 0;
        }

        visited[x][y] = true;
        int count = 1;

        for (int i = 0; i < 4; i++) {
            count += func(color, x + dx[i], y + dy[i]);
        }

        return count;
    }
}