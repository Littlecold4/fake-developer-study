package BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class drawChessBoard {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NnM = br.readLine();
        int answer = 0;
        int N = Integer.parseInt(NnM.split(" ")[0]);
        int M = Integer.parseInt(NnM.split(" ")[1]);
        String chessBoard[] = new String[N];
        String startWithB[] = {"BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB"};
        String startWithW[] = {"WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW"};
        for(int i=0; i<N; i++){
            chessBoard[i] = br.readLine();
        }
        for(int i =0; i<N-7; i++){
            for(int j=0; j<M-7; j++){
                for(int k=0 ; k<=7; k++){
//                    if(chessBoard[i+k].substring(j ,j+8)
                }
            }
        }
    }
}
