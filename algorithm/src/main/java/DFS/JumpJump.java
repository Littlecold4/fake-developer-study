package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class JumpJump {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] jumps = new int[num];
        String[] jumpStr = br.readLine().split(" ");
        Queue<int[]> queue = new LinkedList<>();
        int[] start = {0, 0};
        for (int i = 0; i < num; i++) {
            jumps[i] = Integer.parseInt(jumpStr[i]);
        }
        HashSet<Integer> set = new HashSet<>();
        queue.add(start);
        int result = Integer.MAX_VALUE;
        while (queue.size() != 0) {
            int[] temp = queue.poll();
            set.add(temp[0]);
            if (temp[0] == num - 1 && temp[1] < result) result = temp[1];
            if (temp[0] > num-1) continue;
            for (int i = 1; i <= jumps[temp[0]]; i++) {
                int[] temp1 = {temp[0] + i, temp[1] + 1};
                if(!set.contains(temp1[0])) {
                    set.add(temp1[0]);
                    queue.add(temp1);
                }
            }
        }
        if(result!=Integer.MAX_VALUE) System.out.println(result);
        else System.out.println(-1);
    }

}
