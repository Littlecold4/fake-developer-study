package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuitarStrings {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] NnMStr =br.readLine().split(" ");
        int N = Integer.parseInt(NnMStr[0]);
        int M = Integer.parseInt(NnMStr[1]);
        int setPrice = Integer.MAX_VALUE;
        int unitPrice =Integer.MAX_VALUE;
        for(int i=0; i<M; i++){
            String[] inputStr = br.readLine().split(" ");
            int setNum = Integer.parseInt(inputStr[0]);
            int unitNum = Integer.parseInt(inputStr[1]);

            setPrice = Math.min(setPrice, setNum);
            unitPrice = Math.min(unitPrice,unitNum);
        }
        if(setPrice>unitPrice*6){
            System.out.println(N*unitPrice);
            return;
        }
        int ans;
        if(setPrice>unitPrice*(N%6)) {
            ans = setPrice*(N/6) + unitPrice*(N%6);
        }else{
            ans = setPrice*(N/6+1);
        }
        System.out.println(ans);
    }
}
