package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindTreeParent {
    static int[] parentNode;
    static int[][] arr;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        parentNode = new int[N];

        for (int i = 0; i < N - 1; i++) {
            String[] XnY = br.readLine().split(" ");
            int x = Integer.parseInt(XnY[0]);
            int y = Integer.parseInt(XnY[1]);

            arr[x - 1][y - 1] = 1;
            arr[y - 1][x - 1] = 1;
        }

        for (int i = 0; i < N; i++) {
            for(int j=0; j<N; j++){
                if (arr[i][j] == 1) {
                    arr[i][j] =arr[j][i]=0;
                    parentNode[j] = i+1;
                    dfs(j);
                }
            }
        }

        for(int i=1; i<N; i++){
            System.out.println(parentNode[i]);
        }
    }

    private static void dfs(int y){
        for(int i=0; i<N; i++){
            if(arr[y][i]==1){
                arr[y][i] = arr[i][y] =0;
                parentNode[i] = y+1;
                dfs(i);
            }
        }
    }
}
