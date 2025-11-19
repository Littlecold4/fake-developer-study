package Softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TowelHeights {

    static String[] heightsStr;
    static int N;
    static int[] originHeights;
    static int[] heights;
    static int K;

    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String NnK = br.readLine();
        N = Integer.parseInt(NnK.split(" ")[0]);
        K = Integer.parseInt(NnK.split(" ")[1]);
        
        heightsStr = br.readLine().split(" ");
        originHeights= new int[N];
        heights = new int[N];

        int answer = 0;
        for(int i=0; i<N; i++){
            originHeights[i] = Integer.parseInt(heightsStr[i]);
        }

        for(int i=0; i<N; i++){
            System.out.println(i+"번째 index");
            heights =originHeights;
            raise(i,0);
            printArray();
            answer = highest();
        }

        System.out.println(answer);
    }
    private static void raise(int index,int num){

    }

    private static int highest(){
        int highest=0;
        for(int i=0; i<N; i++){
            if(heights[i]>highest) highest = heights[i];
        }
        return highest;
    }

    private static void printArray(){
        for(int i=0 ; i<N; i++){
            System.out.printf(heights[i]+ " ");
        }
        System.out.println();
    }
}
