import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Turret {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String[] input = br.readLine().split(" ");
            int x1 = Integer.parseInt(input[0]);
            int y1 = Integer.parseInt(input[1]);
            int r1 = Integer.parseInt(input[2]);
            int x2 = Integer.parseInt(input[3]);
            int y2 = Integer.parseInt(input[4]);
            int r2 = Integer.parseInt(input[5]);

            long distSq = (long)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            if (x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
            }

            else if (x1 == x2 && y1 == y2) {
                System.out.println(0);
            }
            else {
                long sumR = (long)(r1 + r2);
                long diffR = (long)(r1 - r2);
                long sumRSq = sumR * sumR;     // (r1 + r2)^2
                long diffRSq = diffR * diffR;   // (r1 - r2)^2

                if (distSq == sumRSq || distSq == diffRSq) {
                    System.out.println(1);
                }

                else if (distSq > sumRSq || distSq < diffRSq) {
                    System.out.println(0);
                }
                else {
                    System.out.println(2);
                }
            }
        }
    }
}