import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExploreMaze {
    static int[][] maze;
    static int N, M;
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NnMStr = br.readLine().split(" ");

         N = Integer.parseInt(NnMStr[0]);
         M = Integer.parseInt(NnMStr[1]);
        maze = new int[N][M];
        boolean[][] visit = new boolean[N][M];

        for(int n=0;n<N; n++){
            String[] inputStr = br.readLine().split("");
            for(int m=0; m<M; m++){
                maze[n][m] = Integer.parseInt(inputStr[m]);
            }
        }
        answer = Integer.MAX_VALUE;
        dfs(visit,1,0,0);

        System.out.println(answer);
    }
    private static void dfs(boolean[][] visit,int deep,int n,int m){

        if (n==N-1 && m ==M-1) {
            if (answer >deep) answer = deep;
            System.out.println("도착!");
            return;
        }
        if(visit[n][m] || maze[n][m]!=1) return;

        System.out.println("n = " + n);
        System.out.println("m = " + m);
        System.out.println("deep = " + deep);

        deep++;
        visit[n][m] = true;
        if(n!=0)
            dfs(visit, deep, n-1, m);
        if(m!=0)
            dfs(visit, deep, n, m-1);
        if(n!=N-1)
            dfs(visit, deep, n+1, m);
        if(m!=M-1)
            dfs(visit, deep, n, m+1);
    }
}
