import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Turret { // 클래스 이름을 문제 요구사항(보통 Main)에 맞춰주세요.
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

            // d^2 (중심 거리의 제곱)
            long distSq = (long)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            // 1. 두 원이 일치하는 경우 (무한대)
            if (x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
            }
            // 2. 중심이 같으나 반지름이 다른 경우 (0개)
            else if (x1 == x2 && y1 == y2) {
                System.out.println(0);
            }
            else {
                long sumR = (long)(r1 + r2);
                long diffR = (long)(r1 - r2);
                long sumRSq = sumR * sumR;     // (r1 + r2)^2
                long diffRSq = diffR * diffR;   // (r1 - r2)^2

                // 3. 외접(1개) 또는 내접(1개)
                if (distSq == sumRSq || distSq == diffRSq) {
                    System.out.println(1);
                }
                // 4. 만나지 않는 경우 (0개)
                // 외부로 멀리 떨어져 있거나, 한 원이 다른 원 안에 쏙 들어가 있는 경우
                else if (distSq > sumRSq || distSq < diffRSq) {
                    System.out.println(0);
                }
                // 5. 두 점에서 만나는 경우 (2개)
                else {
                    System.out.println(2);
                }
            }
        }
    }
}