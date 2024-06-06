import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class DFSandBFS {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);

        int[][] arr = new int[N+1][N+1];
        boolean[] checkDFS = new boolean[N+1];
        boolean[] checkBFS = new boolean[N+1];

        for(int i =1; i<=M; i++){
            String[] input2 = br.readLine().split(" ");

            int a = Integer.parseInt(input2[0]);
            int b = Integer.parseInt(input2[1]);

            arr[a][b] = arr[b][a] = 1;
        }
        System.out.println(dfs(N,V,arr,checkDFS,""));
        System.out.println(bfs(N,V,arr,checkBFS,""));
    }
    public static String dfs(int N,int V,int[][] arr,boolean[] check,String ans){
        check[V] = true;
        ans +=V + " ";

        for(int i=1; i <= N ; i++){
            if(arr[V][i]==1 &&!check[i]) {
                ans =dfs(N,i,arr,check,ans);
            }
        }
        return ans;
    }

    public static String bfs(int N,int V,int[][] arr,boolean[] check,String ans){
        check[V] = true;
        ans +=V + " ";

        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);

        while(!queue.isEmpty()){
            int num = queue.poll();
            for(int j=1; j <= N; j++){
                if(arr[num][j]==1 && !check[j]){
                    check[j] = true;
                    ans += j  +" ";
                    queue.add(j);
                }
            }
        }

        return ans;
    }
}
