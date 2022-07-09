package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlackJack {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] numStr = br.readLine().split(" ");
        int cards = Integer.parseInt(numStr[0]);
        int targetNum = Integer.parseInt(numStr[1]);
        String[] cardNumStr = br.readLine().split(" ");
        int[] cardNum =new int[cards];
        for(int i=0; i<cards; i++){
            cardNum[i] = Integer.parseInt(cardNumStr[i]);
        }
        int answer =0;
//        Arrays.sort(cardNum);
        for(int i=0; i<cards-2; i++){
            for(int j=i+1; j<cards-1; j++){
                for(int k=j+1; k<cards; k++){
                    int sum = cardNum[i]+cardNum[j] + cardNum[k];
                    if(answer< sum &&sum<=targetNum) {
                        answer = sum;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
