import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int[][] board = new int[N][N];

        int[] dy = {-1, 0, 1, 0}; // 위, 오른쪽, 아래, 왼쪽
        int[] dx = {0, 1, 0, -1};

        int y = N / 2;
        int x = N / 2;

        int dir = 0; // 처음 방향: 위
        int num = N * N;

        int targetY = 0;
        int targetX = 0;

        while (num >= 1) {
            board[y][x] = num;

            if (num == K) {
                targetY = y;
                targetX = x;
            }

            if (num == 1) break;

            int nextY = y + dy[dir];
            int nextX = x + dx[dir];

            if (nextY < 0 || nextY >= N || nextX < 0 || nextX >= N || board[nextY][nextX] != 0) {
                dir = (dir + 1) % 4;
                nextY = y + dy[dir];
                nextX = x + dx[dir];
            }

            y = nextY;
            x = nextX;
            num--;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(board[i][j]).append(' ');
            }
            sb.append('\n');
        }

        sb.append((targetY + 1)).append(' ').append((targetX + 1)).append('\n');

        System.out.print(sb);
    }
}
