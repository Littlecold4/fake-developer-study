package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HowMuchPaper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int[][] paper = new int[length][length];
        for (int i = 0; i < length; i++) {
            String[] numStr = br.readLine().split(" ");
            for (int j = 0; j < length; j++) {
                paper[i][j] = Integer.parseInt(numStr[j]);
            }
        }
        int[] answer = {0,0,0};
        StringBuffer sb =new StringBuffer();
        if(length==1) {
            answer[paper[0][0]+1]++;
            for(int i: answer){
                sb.append(i).append("\n");
            }
            System.out.println(sb);
            return;
        }
        answer = splitPaper(paper,answer);
        for(int i: answer){
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

    private static int[] splitPaper(int[][] paper,int[] answer) {
        int length = paper.length;
        int[][] splitedPaper = new int[length / 3][length / 3];
        int number,temp;
        for (int i = 0; i < 9; i++) {
            temp=0;
            for (int y = 0; y < length / 3; y++) {
                for (int x = 0; x < length / 3; x++) {
                    splitedPaper[y][x] = paper[(i/3)*length/3+y][(i%3)*length/3+x];
                }
            }
            if(splitedPaper[0][0]==-1) number=-1;
            else if(splitedPaper[0][0]==0) number=0;
            else number=1;
            for (int y = 0; y < length / 3; y++) {
                for (int x = 0; x < length / 3; x++) {
                    if(splitedPaper[y][x] != number){
                        temp=1;
                        break;
                    }
                }
            }
            if(temp==0){
                answer[number+1]++;
            }
            else answer= splitPaper(splitedPaper,answer);
        }
        return answer;
    }
}
