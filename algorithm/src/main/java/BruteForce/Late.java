package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Late {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuffer sb =new StringBuffer();
        for(int i=0; i<num; i++){
            int time = Integer.parseInt(br.readLine());
            int t ;
            for(t=0; t+t*t<=time; t++){
            }
            sb.append(t-1).append("\n");
        }
        System.out.println(sb);
    }
}
