import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciFunction {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] ans ={0,0};
            ans = fibo(N,ans);
            System.out.println(ans[0]+" "+ans[1]);
        }
    }

    private static int[] fibo(int N,int[] ans){
        if(N == 0){
            ans[0]++;
            return ans;
        }
        if(N==1){
            ans[1]++;
            return ans;
        }
        ans =fibo(N-1,ans);
        ans = fibo(N-2,ans);
        return ans;
    }
}
