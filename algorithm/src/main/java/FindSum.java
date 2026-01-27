import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] NnMStr = br.readLine().split(" ");
        int N = Integer.parseInt(NnMStr[0]);
        int M = Integer.parseInt(NnMStr[1]);

        String[] numStr = br.readLine().split(" ");
        int[] nums = new int[N];
        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(numStr[i]);
        }

        for(int i=0; i<M; i++){
            String[] range = br.readLine().split(" ");
            int startIndex = Integer.parseInt(range[0]);
            int lastIndex = Integer.parseInt(range[1]);

            int sum = 0;
            for(int j=startIndex-1; j<=lastIndex-1; j++){
                sum += nums[j];
            }
            System.out.println(sum);
        }
    }
}
