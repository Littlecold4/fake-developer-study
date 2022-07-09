package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateDate {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] numStr =br.readLine().split(" ");
        int E = Integer.parseInt(numStr[0]);
        if(E==15) E=0;
        int S = Integer.parseInt(numStr[1]);
        if(S==28) S=0;
        int M = Integer.parseInt(numStr[2]);
        if(M==19) M=0;
        int i=0;
        while(true){
            i++;
            if(i%15==E&&i%28==S&&i%19==M) break;
        }
        System.out.println(i);
    }

}
