package Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MakeColorPaper {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] paper = new int[N][N];
        for(int i=0; i<N; i++){
            String[] paperStr = br.readLine().split(" ");
            for(int j=0; j<N; j++){
                paper[i][j] = Integer.parseInt(paperStr[j]);
            }
        }
        System.out.println(findWhite(paper,0,1,1,N));
        System.out.println(findBlue(paper,0,1,1,N));
    }
    private static int findBlue(int[][] paper,int answer,int startX,int startY,int N){
        if(N ==1){
            if(paper[startX-1][startY-1]==1) {
                answer++;
            }
            return answer;
        }
        int Num=0;
        loop:
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(paper[startX-1+i][startY-1+j]==1) Num++;
                else break loop;
            }
        }
        if(Num ==Math.pow(2,N)){
            answer++;
            return answer;
        }
        N=N/2;
        answer = findBlue(paper,answer,startX,startY,N);
        answer = findBlue(paper,answer,startX+N,startY,N);
        answer = findBlue(paper,answer,startX,startY+N,N);
        answer = findBlue(paper,answer,startX+N,startY+N,N);
        return answer;
    }

    private static int findWhite(int[][] paper,int answer,int startX,int startY,int N){
        if(N ==1){
            if(paper[startX-1][startY-1]==0) {
                answer++;
            }
            return answer;
        }
        int Num=0;
        loop:
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(paper[startX-1+i][startY-1+j]==0) Num++;
                else break loop;
            }
        }
        if(Num ==Math.pow(2,N)){
            answer++;
            return answer;
        }
        N=N/2;
        answer = findWhite(paper,answer,startX,startY,N);
        answer = findWhite(paper,answer,startX+N,startY,N);
        answer = findWhite(paper,answer,startX,startY+N,N);
        answer = findWhite(paper,answer,startX+N,startY+N,N);
        return answer;
    }
}
