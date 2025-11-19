import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDelivery {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong( br.readLine());
        long ans = 0;
        while(num%5 != 0 && num>0){
            num -=3;
            ans++;
        }
        if(num%5==0) ans += num/5;
        else ans =-1;
        System.out.println(ans);
    }
}
