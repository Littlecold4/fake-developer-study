package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Rope {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(br.readLine());
        int[] ropes = new int[nums];
        for(int i=0; i<nums; i++){
            ropes[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ropes);
        int max =0;
        for(int i=0; i<nums; i++){
            int temp = ropes[i] * (nums-i);
            if(max<temp){
                max=temp;
            }
        }
        System.out.println(max);
    }
}
