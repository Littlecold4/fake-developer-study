package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class NumberBaseball {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(br.readLine());
        HashSet<Integer> impossibleNumber = new HashSet<>();

        for(int i=0; i<nums; i++){
            String[] row = br.readLine().split(" ");
            String num ="";
            for(int j=100; j<1000; j++){
                if(j>=100) {
                    num = "" + j;
                }
                if(num.charAt(0)==num.charAt(1)||num.charAt(0)==num.charAt(2)||num.charAt(2)==num.charAt(1)
                ||num.charAt(0)=='0'||num.charAt(1)=='0'||num.charAt(2)=='0'){
                    impossibleNumber.add(j);
                }else {
                    if (!strike(num, row[0], Integer.parseInt(row[1])) || !ball(num, row[0], Integer.parseInt(row[2]))) {
                        impossibleNumber.add(j);
                    }
                }
            }
        }
        System.out.println(900-impossibleNumber.size());
    }
    public static boolean strike(String number,String score,int strikeCount){
        int strike=0;
        for(int i=0; i<number.length();i++){
            if(number.charAt(i)==score.charAt(i)){
                strike++;
            }
        }
        return strike==strikeCount? true:false;
    }
    public static boolean ball(String number, String score,int ballCount){
        int ball =0;
        for(int i=0; i<number.length(); i++){
            for(int j=0 ; j<number.length();j++){
                if (i != j) {
                    if(number.charAt(i)==score.charAt(j)) ball++;
                }
            }
        }
        return ball==ballCount? true:false;
    }
}
