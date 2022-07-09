package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divide {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());
        int start = (N/100) *100;
        int start1 =start;
        while(true){
            if(start%F ==0){
                int temp = start-start1;
                if(temp>=10) System.out.println(temp);
                else System.out.println("0"+temp);
                return;
            }
            start++;
        }
    }
}
