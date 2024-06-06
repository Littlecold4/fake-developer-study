package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloorDeco {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String[] NnMStr = br.readLine().split(" ");
        int N = Integer.parseInt(NnMStr[0]);
        int M = Integer.parseInt(NnMStr[1]);

        int ans = 0;
        boolean[][] check = new boolean[N][M];
        String[][] floor = new String[N][M];

        for(int i=0; i<N; i++) {
            floor[i] = br.readLine().split("");
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(check[i][j]) continue;
                check[i][j] =true;
                ans++;
                if(floor[i][j].equals("-")){
                    int k = 0;
                    while(floor[i][j+k].equals("-")){
                        check[i][j+k] = true;
                        k++;

                        if(j+k==M) break;
                    }
                }
                else if(floor[i][j].equals("|")){
                    int k = 0;
                    while(floor[i+k][j].equals("|")){
                        check[i+k][j] = true;
                        k++;

                        if (i+k==N) break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
