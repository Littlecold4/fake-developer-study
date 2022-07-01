package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NumberSort3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] numList = new int[num];
        for(int i=0; i<num; i++){
            numList[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(numList);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<num; i++){
            sb.append(numList[i]);
            if(i!=num-1) sb.append("\n");
        }
        System.out.println(sb);
    }
}
