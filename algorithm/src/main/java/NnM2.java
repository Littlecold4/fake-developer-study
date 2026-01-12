import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NnM2 {
    static int M;
    static int N;
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] NnmStr = br.readLine().split(" ");
        N = Integer.parseInt(NnmStr[0]);
        M = Integer.parseInt(NnmStr[1]);

        for(int i=1; i<=N; i++){
            func(1,"",i);
        }
    }
    private static void func(int m,String answer,int x){
        if(x>N) return;
        if(m==M){
            answer+= " "+x;
            System.out.println(answer.trim());
            return;
        }
        m++;
        answer+= " "+x;

        for(int j =x; j<=N-1; j++){
            func(m,answer,j+1);
        }
    }
}
