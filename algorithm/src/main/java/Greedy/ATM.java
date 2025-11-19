package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ATM {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] time = new int[num];

        String[] timeStr = br.readLine().split(" ");
        for(int i=0; i<num; i++){
            time[i] = Integer.parseInt(timeStr[i]);
        }
        Arrays.sort(time);

        int ans = 0;

        for(int i= 0; i<num;i++){
            ans += time[i]*(num-i);
        }
        System.out.println(ans);
    }
}
