package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNum {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        long i=1;
        while(num>=0){
            num -=i;
            i++;
        }
        System.out.println(i-2);
    }
}
