package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SevenDwarf {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int[] heights = new int[9];
        int heightSum =0;
        for(int i=0; i<9; i++){
            heights[i] = Integer.parseInt(br.readLine());
            heightSum += heights[i];
        }
        Arrays.sort(heights);
        int i,j=0;
        Loop1:
        for( i=0; i<8; i++){
            for( j=i; j<9; j++){
                if(heights[i]+heights[j]==heightSum-100) break Loop1;
            }
        }
        StringBuffer sb =new StringBuffer();
        for(int index=0 ;index<9; index++){
            if(index!=i&& index!=j){
                sb.append(heights[index]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
