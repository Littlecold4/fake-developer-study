package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Thirty {
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] N = br.readLine().split("");
        Arrays.sort(N);
        if(!N[0].equals("0")) {
            System.out.println(-1);
            return;
        }
        int sum = 0;
        for(int i=0; i<N.length; i++){
            sum+= Integer.parseInt(N[i]);
            sum %=3;
        }
        if (sum%3 !=0){
            System.out.println(-1);
            return;
        }
        String answer ="";
        for(int i=N.length-1; i>=0; i--){
            answer += N[i];
        }
        System.out.println(answer);
    }
}
