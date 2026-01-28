import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st= new StringTokenizer(br.readLine());
        int[] nums = new int[N];
        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<M; i++){
            st= new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(st.nextToken());
            int lastIndex = Integer.parseInt(st.nextToken());

            int sum = 0;
            for(int j=startIndex-1; j<=lastIndex-1; j++){
                sum += nums[j];
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb.toString());
    }
}
