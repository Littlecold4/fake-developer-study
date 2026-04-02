import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Combination {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        if (N / 2 < M) M = N - M;

        BigInteger up = BigInteger.ONE;
        BigInteger down = BigInteger.ONE;

        for (int i = 1; i <= M; i++) {
            up = up.multiply(BigInteger.valueOf(N - i + 1));
            down = down.multiply(BigInteger.valueOf(i));
        }

        System.out.println(up.divide(down));
    }
}