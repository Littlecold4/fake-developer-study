package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AtoB {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] AnBStr = br.readLine().split(" ");
        int A = Integer.parseInt(AnBStr[0]);
        int B = Integer.parseInt(AnBStr[1]);
        int ans = 0;
        while(true){
            if(B==A) break;
            if(B%10 ==1){
                B /=10;
                ans++;
            }
            else if(B%2 ==0){
                B /=2;
                ans++;
            }else{
                System.out.println(-1);
                return;
            }
            if(B==0) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(ans+1);
    }
}
