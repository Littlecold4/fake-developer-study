import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato {
    static int M, N;
    static int[][] tomatoes;
    // 상하좌우 이동을 위한 좌표 배열
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        tomatoes = new int[N][M];
        Queue<int[]> queue = new LinkedList<>();
        int unripeCount = 0; // 안 익은 토마토 개수 카운트

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                tomatoes[i][j] = Integer.parseInt(st.nextToken());
                if (tomatoes[i][j] == 1) {
                    // 익은 토마토의 좌표를 큐에 미리 다 넣어둠
                    queue.add(new int[]{i, j});
                } else if (tomatoes[i][j] == 0) {
                    unripeCount++;
                }
            }
        }

        // 처음부터 다 익어있었다면 0 출력
        if (unripeCount == 0) {
            System.out.println(0);
            return;
        }

        System.out.println(solve(queue, unripeCount));
    }

    static int solve(Queue<int[]> queue, int unripeCount) {
        int days = 0;

        while (!queue.isEmpty()) {
            // 현재 큐에 들어있는 개수만큼이 '오늘' 동시에 퍼지는 토마토들임
            int size = queue.size();
            boolean spread = false;

            for (int s = 0; s < size; s++) {
                int[] curr = queue.poll();

                for (int i = 0; i < 4; i++) {
                    int nr = curr[0] + dr[i];
                    int nc = curr[1] + dc[i];

                    // 범위 내에 있고 안 익은 토마토(0)라면
                    if (nr >= 0 && nr < N && nc >= 0 && nc < M && tomatoes[nr][nc] == 0) {
                        tomatoes[nr][nc] = 1; // 익히기
                        unripeCount--; // 남은 개수 감소
                        queue.add(new int[]{nr, nc}); // 내일 주변을 익히기 위해 큐에 추가
                        spread = true;
                    }
                }
            }

            if (spread) days++; // 이번 턴에 하나라도 익었다면 하루 증가
        }

        // 큐가 비었는데 안 익은 게 남았다면 다 익지 못하는 상황임
        return unripeCount == 0 ? days : -1;
    }
}