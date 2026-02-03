import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class FindArea {
    static int M;
    static int N;
    static int K;
    static boolean[][] painted;

    static int[] dy = {0, 0, 1, -1};
    static int[] dx = {1, -1, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] MnNnK = br.readLine().split(" ");
        M = Integer.parseInt(MnNnK[0]);
        N = Integer.parseInt(MnNnK[1]);
        K = Integer.parseInt(MnNnK[2]);
        painted = new boolean[M][N];

        for(int i = 0; i<K; i++){
            String[] square= br.readLine().split(" ");
            int x1 = Integer.parseInt(square[0]);
            int y1 = Integer.parseInt(square[1]);
            int x2 = Integer.parseInt(square[2]);
            int y2 = Integer.parseInt(square[3]);

            paintSquare(x1,y1,x2,y2);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!painted[i][j]) {
                    result.add(bfs(i, j));
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for (int area : result) {
            System.out.print(area + " ");
        }
    }

    static void paintSquare(int x1,int y1, int x2, int y2){
        for(int x =x1; x<x2 ; x++){
            for(int y=y1; y<y2; y++){
                painted[y][x] = true;
            }
        }
    }

    public static int bfs(int y, int x) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y, x});
        painted[y][x] = true; // 방문 표시
        int count = 1;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            for (int i = 0; i < 4; i++) {
                int ny = curr[0] + dy[i];
                int nx = curr[1] + dx[i];

                if (ny >= 0 && ny < M && nx >= 0 && nx < N) {
                    if (!painted[ny][nx]) {
                        painted[ny][nx] = true;
                        queue.add(new int[]{ny, nx});
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
