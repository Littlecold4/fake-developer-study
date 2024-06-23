package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindTreeParent {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] parentNode = new int[N];

        for (int i = 0; i < N - 1; i++) {
            String[] XnY = br.readLine().split(" ");
            int x = Integer.parseInt(XnY[0]);
            int y = Integer.parseInt(XnY[1]);

            if(x==1) parentNode[y-1]=1;
            if(y==1) parentNode[x-1]=1;
        }

    }

    private static void dfs(int y,int N,int[][] arr,int[] parentNode){
        for(int i=0; i<N; i++){
            if(arr[y][i]==1){
                arr[y][i] = arr[i][y] =0;
                parentNode[i] = y+1;
                dfs(i,N,arr,parentNode);
            }
        }
    }
}
