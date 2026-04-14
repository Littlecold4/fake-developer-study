import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Shortest {
    // 상, 하, 좌, 우 이동을 위한 벡터
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int N, M;
    static int[][] map;
    static int[][] shortest;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        shortest = new int[N][M];

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                shortest[i][j] = -1; // 기본값을 -1로 설정 (방문하지 않은 곳)

                if (map[i][j] == 2) {
                    shortest[i][j] = 0; // 시작 지점 거리는 0
                    queue.add(new int[]{i, j}); // 시작점을 큐에 삽입
                } else if (map[i][j] == 0) {
                    shortest[i][j] = 0; // 원래 갈 수 없는 땅은 0
                }
            }
        }

        // BFS 탐색 시작
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int y = curr[0];
            int x = curr[1];

            for (int i = 0; i < 4; i++) {
                int nextY = y + dy[i];
                int nextX = x + dx[i];

                // 맵 범위 내에 있고, 아직 방문하지 않았으며(-1), 갈 수 있는 땅(1)인 경우
                if (nextY >= 0 && nextY < N && nextX >= 0 && nextX < M) {
                    if (shortest[nextY][nextX] == -1 && map[nextY][nextX] == 1) {
                        shortest[nextY][nextX] = shortest[y][x] + 1;
                        queue.add(new int[]{nextY, nextX});
                    }
                }
            }
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(shortest[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}