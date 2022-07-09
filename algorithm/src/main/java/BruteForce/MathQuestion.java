package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathQuestion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result;
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<num; i++){
            result=0;
            String[] numStr = br.readLine().split(" ");
            int n = Integer.parseInt(numStr[0]);
            int m = Integer.parseInt(numStr[1]);
            for(int a=1; a<n; a++){
                for(int b=a+1 ; b<n; b++){
                    int number = (a*a+b*b+m)%(a*b);
                    if(number==0) result++;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
