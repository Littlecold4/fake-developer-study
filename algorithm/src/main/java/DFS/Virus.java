package DFS;

import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Virus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nodes = Integer.parseInt(br.readLine());
        int nums = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        int[][] coms = new int[nums][2];
        for (int i = 0; i < nums; i++) {
            String[] numStr = br.readLine().split(" ");
            coms[i][0] = Integer.parseInt(numStr[0]);
            coms[i][1] = Integer.parseInt(numStr[1]);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        while (queue.size()!=0) {
            int temp = queue.poll();
            for (int i = 0; i < nums; i++) {
                if (coms[i][0] == temp && !set.contains(coms[i][1])) {
                    set.add(coms[i][1]);
                    queue.add(coms[i][1]);
                }
                if (coms[i][1] == temp && !set.contains(coms[i][0])) {
                    set.add(coms[i][0]);
                    queue.add(coms[i][0]);
                }
            }
        }
        System.out.println(set.size()-1);
    }
}
