package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tournament {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int participants = Integer.parseInt(nums[0]);
        int N = Integer.parseInt(nums[1]);
        int M = Integer.parseInt(nums[2]);
        int cnt =0;
        while(N!=M){
            N =(N+1)/2;
            M = (M+1)/2;
            cnt++;
        }
        System.out.println(cnt);
    }
}
