import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShortCut {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] NnDStr = br.readLine().split(" ");
        int N = Integer.parseInt(NnDStr[0]);
        int D = Integer.parseInt(NnDStr[1]);
        int[] dp = new int[D];
        int[][] shortcut = new int[N][3];
        for(int i=0; i<D; i++){
            dp[i]= i;
        }
        for(int n=0; n<N;n++){
            String[] input = br.readLine().split(" ");
            int start= Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);
            int distance = Integer.parseInt(input[2]);

            if(end - start > distance&&end<D) {
                for(int i = end; i<D;i++){
//                    dp[i] = Math.min( )
                }
            }
        }

    }
}
