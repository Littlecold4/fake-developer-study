//package Softeer;
//
//import java.io.*;
//import java.util.*;
//
//public class TreeGardening {
//    static int N;
//    static int[][] maps;
//    static boolean[][] used ;
//    static int answer;
//    public static void main(String[] args) throws IOException{
//        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//
//        N = Integer.parseInt(br.readLine());
//
//        maps = new int[N][N];
//        used = new boolean[N][N];
//        answer =0;
//
//        for(int i=0; i<N; i++){
//            String[] numStr = br.readLine().split(" ");
//            for(int j=0; j<N; j++){
//                maps[i][j] = Integer.parseInt(numStr[j]);
//            }
//        }
//
//
//    }
//    private static int dfs(int x,int y,int cnt, int sum){
//        if(cnt == N){
//            answer = Math.max(answer,sum);
//            return answer;
//        }
//        for(int i=0; i<N; i++){
//            for(int j=0; j<N; j++){
//
//            }
//        }
//    }
//}
