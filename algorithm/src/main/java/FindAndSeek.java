

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class FindAndSeek {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NnkStr = br.readLine().split(" ");
        int N = Integer.parseInt(NnkStr[0]);
        int K = Integer.parseInt(NnkStr[1]);
        if (N == K) {
            System.out.println(0);
            return;
        }
        boolean[] visit = new boolean[100001];
        visit[N] = true;
        Queue<Integer> q = new LinkedList<>();

        q.add(N);
        int size;
        int cnt = 0;

        while (true) {
            cnt++;
            size = q.size();
            for (int i = 0; i < size; i++) {
                int x = q.remove();
                visit[x] = true;
                if (x - 1 == K || x + 1 == K || x * 2 == K) {
                    System.out.println(cnt);
                    return;
                }
                if (x - 1 >= 0 && !visit[x - 1]) {
                    visit[x - 1] = true;
                    q.add(x - 1);
                }
                if (x + 1 <= 100000 && !visit[x + 1]) {
                    visit[x + 1] = true;
                    q.add(x + 1);
                }
                if (x * 2 <= 100000 && !visit[x * 2]) {
                    visit[x * 2] = true;
                    q.add(x * 2);
                }
            }
        }
    }
}
