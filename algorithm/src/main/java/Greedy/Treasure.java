package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Treasure {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(br.readLine());
        int[] Anumbers = new int[nums];
        Integer[] Bnumbers = new Integer[nums];
        String[] numStr1 = br.readLine().split(" ");
        String[] numStr2 = br.readLine().split(" ");
        for(int i=0; i<nums; i++){
            Anumbers[i] = Integer.parseInt(numStr1[i]);
            Bnumbers[i] = Integer.parseInt(numStr2[i]);
        }
        Arrays.sort(Anumbers);
        Arrays.sort(Bnumbers,Collections.reverseOrder());

        int sum =0;
        for(int i=0; i<nums; i++){
            sum += Anumbers[i] * Bnumbers[i];
        }
        System.out.println(sum);
    }
}