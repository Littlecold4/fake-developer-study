package Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lotto {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String input[] = br.readLine().split(" ");
            int Num = Integer.parseInt(input[0]);
            String[] inputRe = new String[Num];
            for(int i=0 ; i<Num; i++){
                inputRe[i] = input[i+1];
            }
            if(Num == 0) break;
            String[] lottoNum = new String[6];
            print(lottoNum,inputRe,0,0);
            System.out.println();
        }
    }
    private static void print(String[] lottoNum,String[] input, int index, int cnt){
        if(cnt == 6){
            for(int i=0; i<6; i++){
                System.out.print(lottoNum[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=index; i<input.length; i++){
            lottoNum[cnt] = input[i];
            print(lottoNum,input,i+1,cnt+1);
        }
    }
}
