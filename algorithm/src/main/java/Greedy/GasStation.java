package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GasStation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int city = Integer.parseInt(br.readLine());
        String[] distanceStr = br.readLine().split(" ");
        String[] gasPriceStr = br.readLine().split(" ");

        long[] distance = new long[city - 1];
        for(int i=0; i<city-1; i++){
            distance[i]  = Integer.parseInt(distanceStr[i]);
        }

        long[] gasPrice = new long[city-1];
        for(int i=0; i<city-1; i++){
            gasPrice[i]  = Integer.parseInt(gasPriceStr[i]);
        }
        long currentPrice = gasPrice[0];
        long answer = gasPrice[0]*distance[0];
        long distanceTemp=0;

        for(int i=1; i<gasPrice.length; i++){
            if (currentPrice>gasPrice[i]){
                answer += currentPrice*distanceTemp;
                currentPrice= gasPrice[i];
                distanceTemp =distance[i];
            }else{
                distanceTemp += distance[i];
            }
        }


        System.out.println(answer+currentPrice*distanceTemp);
    }

}
