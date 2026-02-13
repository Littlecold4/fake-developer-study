import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tomato {
    static int M;
    static int N;
    static int[][] tomatoes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] MnNStr = br.readLine().split(" ");
        M = Integer.parseInt(MnNStr[0]);
        N = Integer.parseInt(MnNStr[1]);

        tomatoes = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                tomatoes[i][j] = Integer.parseInt(input[j]);
            }
        }

        // 처음에 이미 다 익어있는지 확인
        if (check()) {
            System.out.println("0");
            return;
        }

        int answer = 0;

        while (true) {
            boolean changed = false;

            // 1. 이번 루프(하루)에서 새롭게 익을 토마토 찾기
            // 원래 익어있던 '1' 주변의 '0'을 찾아 '2'로 임시 변경합니다.
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (tomatoes[i][j] == 1) {
                        // 상하좌우 탐색 (0인 것만 2로 바꿈)
                        if (i > 0 && tomatoes[i - 1][j] == 0) { tomatoes[i - 1][j] = 2; changed = true; }
                        if (i < N - 1 && tomatoes[i + 1][j] == 0) { tomatoes[i + 1][j] = 2; changed = true; }
                        if (j > 0 && tomatoes[i][j - 1] == 0) { tomatoes[i][j - 1] = 2; changed = true; }
                        if (j < M - 1 && tomatoes[i][j + 1] == 0) { tomatoes[i][j + 1] = 2; changed = true; }
                    }
                }
            }

            // 2. 변화가 없다면(더 이상 익을 토마토가 없다면) 중단
            if (!changed) {
                // 루프가 끝났는데도 안 익은 토마토(0)가 남아있다면 -1, 아니면 정답 출력
                if (!check()) {
                    System.out.println("-1");
                } else {
                    System.out.println(answer);
                }
                break;
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (tomatoes[i][j] == 2) {
                        tomatoes[i][j] = 1;
                    }
                }
            }

            answer++;
        }
    }

    static boolean check() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tomatoes[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}