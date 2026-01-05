import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeBall {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] NnMStr =br.readLine().split(" ");
        int N = Integer.parseInt(NnMStr[0]);
        int M = Integer.parseInt(NnMStr[1]);

        int[] balls = new int[N];

        for(int i=0; i<N; i++){
            balls[i] = i+1;
        }

        for(int i=0; i<M; i++){
            String[] input = br.readLine().split(" ");
            int num1 = Integer.parseInt(input[0])-1;
            int num2 = Integer.parseInt(input[1])-1;

            int temp = balls[num1];
            balls[num1] = balls[num2];
            balls[num2] = temp;
        }

        for(int i=0; i<N; i++){
            System.out.printf(balls[i]+" ");
        }
    }
}
