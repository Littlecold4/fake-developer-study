package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PaintChess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numStr = br.readLine().split(" ");
        int M = Integer.parseInt(numStr[0]);
        int N = Integer.parseInt(numStr[1]);
        String[] chessBoard = new String[M];
        for(int i=0; i<M; i++){
            chessBoard[i] = br.readLine();
        }
        int B = count(M,N,"B",chessBoard);
        int W = count(M,N,"W",chessBoard);
        if(B>W) System.out.println(W);
        else System.out.println(B);
    }
    private static int count(int M, int N,String color,String[] chessBoard){
        Character[] colors = {'B','W'};
        int x=0;
        int result =0;
        int minResult=2500;
        if(color =="W")  x =1;
        for(int i=0; i<=M-8; i++){
            for(int j=0; j<=N-8; j++){
                result=0;
                for(int a= i; a<i+8; a++){
                    for(int b = j; b<j+8; b++){
                        if(chessBoard[a].charAt(b)!= colors[(a+b+x)%2]) result++;
                    }
                }
                if(result<minResult) minResult = result;
            }
        }
        return minResult;
    }
}
