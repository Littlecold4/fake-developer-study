import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NnM_1 {
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] NnMStr = br.readLine().split(" ");
        int N = Integer.parseInt(NnMStr[0]);
        int M = Integer.parseInt(NnMStr[1]);

        int[] arr = new int[M];
        boolean[] check = new boolean[N];

        dfs(arr,check,N,M,0);
    }

    public static void dfs(int[] arr, boolean[] check, int N, int M ,int depth) {
        if (depth == M) {
            for (int a : arr) System.out.print(a + " ");
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if(!check[i]){
                check[i] =true;
                arr[depth] = i+1;
                dfs(arr,check,N,M,depth+1);
                check[i] = false;
            }
        }
    }
}
