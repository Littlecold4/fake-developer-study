import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NnM4 {
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] NnMStr =br.readLine().split(" ");
        N =Integer.parseInt(NnMStr[0]);
        M = Integer.parseInt(NnMStr[1]);

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

        for(int j =x; j<=N; j++){
            func(m,answer,j);
        }
    }
}
