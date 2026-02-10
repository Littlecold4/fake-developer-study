import java.io.*;
import java.util.*;

public class IncreasingSequence4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) nums[i] = Integer.parseInt(st.nextToken());

        int[] tails = new int[N];     // LIS를 유지하기 위한 최소 끝값 저장
        int[] pos = new int[N];       // nums[i]가 tails의 어느 인덱스에 들어갔는지 기록
        int[] parent = new int[N];    // 실제 수열 복원을 위한 이전 인덱스 기록

        int length = 0;
        for (int i = 0; i < N; i++) {
            // 이분 탐색: nums[i]가 들어갈 위치 찾기
            int low = 0, high = length;
            while (low < high) {
                int mid = (low + high) / 2;
                if (tails[mid] < nums[i]) low = mid + 1;
                else high = mid;
            }

            tails[low] = nums[i];
            pos[low] = i; // tails[low]에 저장된 값의 원본 인덱스 기록

            // 경로 기록: 현재 숫자의 이전 위치는 tails[low-1]의 원본 인덱스
            parent[i] = (low > 0) ? pos[low - 1] : -1;

            if (low == length) length++;
        }

        // 3. 경로 역추적 (뒤에서부터 찾아 올라감)
        StringBuilder sb = new StringBuilder();
        sb.append(length).append("\n");

        Stack<Integer> stack = new Stack<>();
        int curr = pos[length - 1]; // LIS의 마지막 요소 인덱스
        while (curr != -1) {
            stack.push(nums[curr]);
            curr = parent[curr];
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }
        System.out.println(sb);
    }
}