package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i=1; i<500; i++){
            double num = i*i+N;
            if(Math.sqrt(num)==(int)Math.sqrt(num)) {
                result++;
                System.out.println(num);
            }
        }
        System.out.println(result);
    }
}
