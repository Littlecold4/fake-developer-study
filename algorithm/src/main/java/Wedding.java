import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Wedding {
    static int n,m;
    static boolean[] visited;
    static ArrayList<Integer>[] adj;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        n= Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        adj = new ArrayList[n+1];
        for(int i=1 ; i<=n; i++){
            adj[i] = new ArrayList<>();
        }

        for(int i=0; i<m;i++){
            String[] AnBStr = br.readLine().split(" ");
            int a = Integer.parseInt(AnBStr[0]);
            int b = Integer.parseInt(AnBStr[1]);
            adj[a].add(b);
            adj[b].add(a);
        }
        System.out.println(bfs(1));
    }

    static int bfs(int start){
        Queue<int[]> q =new LinkedList<>();
        visited = new boolean[n+1];

        q.add(new int[]{start,0});
        visited[start] = true;

        int count = 0;
        while (!q.isEmpty()) {
            int[] current = q.poll();
            int now = current[0];
            int depth = current[1];

            if (depth >= 2) continue;

            for (int next : adj[now]) {
                if (!visited[next]) {
                    visited[next] = true;
                    count++;
                    q.add(new int[]{next, depth + 1});
                }
            }
        }
        return count;
    }
}
