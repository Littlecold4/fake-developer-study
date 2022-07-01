package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] numList = new int[num];
        for(int i=0; i<num; i++){
            numList[i] = Integer.parseInt(br.readLine());
        }
        int temp;
        for(int i=0; i<num-1; i++){
            for(int j=0; j<num-1; j++){
                if(numList[j]>numList[j+1]){
                    temp = numList[j];
                    numList[j] = numList[j+1];
                    numList[j+1] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<num; i++){
            sb.append(numList[i]);
            if(i!=num-1) sb.append("\n");
        }
    }
}
