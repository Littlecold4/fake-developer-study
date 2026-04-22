import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Blog {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] visitors = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            visitors[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = findMaxVisitorPeriod(visitors, x);

        if (result[0] == 0) {
            System.out.println("SAD");
            return;
        }

        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    private static int[] findMaxVisitorPeriod(int[] visitors, int period) {
        int currentSum = 0;
        for (int i = 0; i < period; i++) {
            currentSum += visitors[i];
        }

        int maxSum = currentSum;
        int count = 1;

        for (int right = period; right < visitors.length; right++) {
            currentSum += visitors[right];
            currentSum -= visitors[right - period];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                count = 1;
            } else if (currentSum == maxSum) {
                count++;
            }
        }

        return new int[]{maxSum, count};
    }
}