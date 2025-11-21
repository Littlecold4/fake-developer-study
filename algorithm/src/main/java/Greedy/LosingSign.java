package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LosingSign {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] math = br.readLine().split("-");
        int ans = sumOfMinus(math[0]);
        for(int i =1 ; i<math.length; i++){
            ans -= sumOfMinus(math[i]);
        }
        System.out.println(ans);
    }
    private static int sumOfMinus(String math){
        String[] splitMath = math.split("");
        int num =0;
        int sum = 0;
        for(int i=0; i<splitMath.length; i++){
            if(!splitMath[i].equals( "+")) {
                num = 10*num +Integer.parseInt(splitMath[i]);
            }else{
                sum += num;
                num=0;
            }
        }
        sum +=num;
        return sum;
    }
}
