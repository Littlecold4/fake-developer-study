import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NnM3 {
    static int N;
    static int M;
    static String ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] NnMStr =br.readLine().split(" ");
        N =Integer.parseInt(NnMStr[0]);
        M = Integer.parseInt(NnMStr[1]);
         ans ="";

        func(0,"");
        System.out.println(ans);
    }
    private static void func(int depth,String temp){
        if(depth==M){
            ans = ans + temp.trim()+"\n";
            return;
        }
        for(int i =1; i<=N; i++){
            func(depth+1,temp+" " + i);
        }
    }

}
