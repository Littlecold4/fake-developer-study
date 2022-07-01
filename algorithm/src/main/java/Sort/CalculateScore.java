package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class CalculateScore {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int[][] scores = new int[8][2];
        for(int i=0; i<=7; i++){
            scores[i][0] = i+1;
            scores[i][1] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(scores, new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        if (o1[1] == o2[1]) {
                            return o2[0]-o1[0];
                        } else {
                            return o2[1]-o1[1];
                        }
                    }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(scores[0][1]+scores[1][1]+scores[2][1]+scores[3][1]+scores[4][1]).append("\n");
        int sum=0;
        for(int i=0;i<5; i++){
            sum += scores[i][1];
        }
        for(int i=5; i<8; i++){
            scores[i][0]=10;
        }
        Arrays.sort(scores, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                    return o1[0]-o2[0];
            }
        });

        for(int i=0; i<5; i++){
            sb.append(scores[i][0]).append("\n");
        }
        System.out.println(sb);
    }
}
