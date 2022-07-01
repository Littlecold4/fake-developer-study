import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sddd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int me = Integer.parseInt(br.readLine());
        int me = Integer.parseInt(br.readLine());
        int cnt = 0;

        // 내림차순 정렬
        int [] vote = new int[n-1];
        for (int i=0; i<n-1; i++) {
            vote[i] = Integer.parseInt(br.readLine());
        }

        for (int i=0; i<n-1; i++) {

            if ( vote.length != 0 ) {
                Arrays.sort(vote);
//                int max = vote[vote.length-1];
                int max = vote.length-1;

                if (me <= vote[max]) {
                    vote[max]--;
                    me ++;
                    cnt++;
                }
            }
            else {
                cnt = 0;
            }
        }
        System.out.println(cnt);
    }
}
