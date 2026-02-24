import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ExploreMaze {
    static int[][] maze;
    static int N, M;
    // 상하좌우 이동을 위한 배열
    static int[] dn = {-1, 1, 0, 0};
    static int[] dm = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        maze = new int[N][M];

        for (int n = 0; n < N; n++) {
            String input = br.readLine();
            for (int m = 0; m < M; m++) {
                maze[n][m] = input.charAt(m) - '0';
            }
        }

        System.out.println(bfs(0, 0));
    }

    private static int bfs(int startN, int startM) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startN, startM});

        // 방문 체크를 겸해 이동 거리를 저장 (원본 배열 수정 방식)
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currN = current[0];
            int currM = current[1];

            // 도착지점 도달 시 거리 반환
            if (currN == N - 1 && currM == M - 1) {
                return maze[currN][currM];
            }

            for (int i = 0; i < 4; i++) {
                int nextN = currN + dn[i];
                int nextM = currM + dm[i];

                // 범위를 벗어나지 않고, 길(1)인 경우에만 이동
                if (nextN >= 0 && nextN < N && nextM >= 0 && nextM < M) {
                    if (maze[nextN][nextM] == 1) {
                        // 현재 거리 + 1을 다음 칸에 저장 (방문 처리 겸용)
                        maze[nextN][nextM] = maze[currN][currM] + 1;
                        queue.add(new int[]{nextN, nextM});
                    }
                }
            }
        }
        return -1; // 경로가 없는 경우
    }
}