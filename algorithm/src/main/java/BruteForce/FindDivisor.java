package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FindDivisor {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] numStr = br.readLine().split(" ");
        int num = Integer.parseInt(numStr[0]);
        int Nth = Integer.parseInt(numStr[1]);
        List<Integer> divisor = new ArrayList<>();
        for(int i=1; i<=num; i++){
            if(num %i==0) divisor.add(i);
        }
        if(divisor.size()<Nth) System.out.println(0);
        else System.out.println(divisor.get(Nth-1));
    }
}
