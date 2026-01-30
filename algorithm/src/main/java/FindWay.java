import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindWay {
    static int[] visit;
    static int N;
    static int[][] ways;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ways = new int[N][N];
        int[][] answer = new int[N][N];

        for(int i=0; i<N; i++){
            String[] wayStr =  br.readLine().split(" ");
            for(int j=0; j<N; j++){
                ways[i][j] = Integer.parseInt(wayStr[j]);
            }
        }

        for(int i =0; i<N; i++){
            visit = new int[N];
            func1(i);
            answer[i] = visit;
        }

        printAnswer(answer);
    }

    static void func1(int index){
        for(int i=0; i<N; i++){
            if(ways[index][i] == 1&&visit[i]!=1){
                visit[i] = 1;
                func1(i);
            }
        }
    }
    static void printAnswer(int[][] answer){
        for(int i =0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }

}
