package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<N; i++){
            int sum=0;
            int num =i;
            while(num!=0){
                sum += num%10;
                num /=10;
            }
            if(sum+i == N){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
