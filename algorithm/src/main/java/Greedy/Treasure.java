package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Treasure {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(br.readLine());
        int[] Anumbers = new int[nums];
        int[] Bnumbers = new int[nums];
        String[] numStr1 = br.readLine().split(" ");
        String[] numStr2 = br.readLine().split(" ");
        for(int i=0; i<nums; i++){
            Anumbers[i] = Integer.parseInt(numStr1[i]);
            Bnumbers[i] = Integer.parseInt(numStr2[i]);
        }
        Arrays.sort(Anumbers);
    }
}