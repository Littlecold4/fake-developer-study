package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleOf3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  num = br.readLine();
        String cnt = "0";
        String[] result = plusNumber(num,cnt);
        StringBuffer  sb = new StringBuffer();
//        sb.append(result[1]).append("\n");
        System.out.println(result[1]);
//        if(result[0]%3==0) sb.append("YES");
//        else sb.append("NO");
        if(Integer.parseInt(result[0])%3==0) System.out.println("YES");
        else System.out.println("NO");
//        System.out.println(sb);
    }
    private static String[] plusNumber(String num,String cnt){
        int sum=0;
        String[] result = {num,cnt};
        if(num.length()==1) return result;
        for(int i=0; i<num.length(); i++){
            sum += num.charAt(i)-'0';
        }
        cnt = String.valueOf(Integer.parseInt(cnt)+1 );
        return plusNumber(String.valueOf(sum),cnt);
    }
}
