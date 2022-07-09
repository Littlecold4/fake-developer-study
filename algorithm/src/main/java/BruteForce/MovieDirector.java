package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MovieDirector {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;
        int number= 0;
        while(cnt!=num){
            number++;
            if(String.valueOf(number).contains("666")) cnt++;
        }
        System.out.println(number);
    }
}
