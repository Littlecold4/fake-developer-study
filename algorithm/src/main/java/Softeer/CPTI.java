package Softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CPTI {
    static int M;
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        String[] NnMStr = br.readLine().split(" ");
        int N = Integer.parseInt(NnMStr[0]);
        M = Integer.parseInt(NnMStr[1]);

        String[] CPTIList = new String[N];
        int answer = 0;

        for(int i=0; i<N; i++){
            CPTIList[i] = br.readLine();
        }

        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                answer = compareCPTI(CPTIList[i],CPTIList[j],answer);
            }
        }

        System.out.println(answer);
    }

    private static int compareCPTI(String a,String b,int answer){
        int difference =0;
        for(int i=0; i<M; i++){
            if(a.charAt(i)!=b.charAt(i)){
                difference++;
            }
            if(difference==3){
                return answer;
            }
        }
        return ++answer;
    }
}
