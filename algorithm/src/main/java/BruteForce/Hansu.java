package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hansu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result=0;
        int beforeDistance =0;
        int afterDistance =0;
        int number =0;
        for(int i=1; i<=num; i++){
            number=i;
            if(i<=99) result++;
            else {
                result++;
                beforeDistance = number % 10 - (number / 10) % 10;
                number /=10;
                while (number >= 10) {
                    afterDistance =  number % 10 - (number / 10) % 10;
                    if(afterDistance!=beforeDistance){
                        result--;
                        break;
                    }
                    number/=10;
                }
            }
        }
        System.out.println(result);
    }
}
