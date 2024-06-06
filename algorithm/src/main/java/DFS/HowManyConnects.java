package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowManyConnects {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] NnMStr = br.readLine().split(" ");
        int N = Integer.parseInt(NnMStr[0]);
        int M = Integer.parseInt(NnMStr[1]);

        int[][] arr =new int[N][N];
        int ans = 0;

        if(M == 0) {
            System.out.println(N);
            return;
        }
        for(int i=0; i<N; i++){
            arr[i][i] =1;
        }
        for(int i=0; i<M; i++){
            String[] XnYStr = br.readLine().split(" ");
            int x = Integer.parseInt(XnYStr[0]);
            int y = Integer.parseInt(XnYStr[1]);

            arr[x-1][y-1] = 1;
        }

        for(int i=0; i<N; i++){
            for(int j=i; j<N; j++){
                if(arr[i][j]==1) {
                    ans++;
                    DFS(arr,i,N);
                }
            }
        }
        System.out.println(ans);
    }
    private static void DFS(int[][] arr,int start,int N){
        for(int i=0; i<N; i++){
            if(arr[start][i] == 1){
                arr[start][i]=0;
                DFS(arr,i,N);
            }
        }
    }
}
