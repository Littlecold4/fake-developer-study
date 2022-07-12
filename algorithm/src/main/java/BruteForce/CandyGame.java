package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CandyGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[][] candies = new String[num][num];
        for (int i = 0; i < num; i++) {
            String[] rows = br.readLine().split("");
            for (int j = 0; j < num; j++) {
                candies[i][j] = rows[j];
            }
        }
        int MaxCnt =0;
        MaxCnt = getMaxCnt(num, candies, MaxCnt);
        candies= changeRC(num,candies);
        MaxCnt = getMaxCnt(num, candies, MaxCnt);
//        if(MaxCnt==1) System.out.println(0);
        System.out.println(MaxCnt);
    }

    private static int getMaxCnt(int num, String[][] candies, int maxCnt) {
        String temp;
        int RowCnt;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - 1; j++) {
                if(!candies[i][j].equals(candies[i][j+1])) {
                    temp = candies[i][j];
                    candies[i][j] = candies[i][j + 1];
                    candies[i][j + 1] = temp;
//                System.out.println(Arrays.deepToString(candies));
                    RowCnt = countRow(num, candies[i]);
                    if (maxCnt < RowCnt) maxCnt = RowCnt;

                    for (int k = 0; k < num; k++) {
                        RowCnt = countRow(num, changeRC(num, candies)[k]);
                        if (maxCnt < RowCnt) maxCnt = RowCnt;
                    }
                }
            }
        }
        return maxCnt;
    }

    private static int countRow(int num, String[] candies) {
        int cnt;
        int maxCnt = 0;
//        System.out.println(Arrays.toString(candies));
        for (int i = 0; i < num; i++) {
            cnt = 1;
            for (int j = i+1; j < num; j++) {
                if (candies[i] .equals( candies[j])) {
                    cnt++;
//                    System.out.println(cnt);
                }
                else break;
            }
            if (maxCnt < cnt) maxCnt = cnt;
        }
//        System.out.println(maxCnt);
        return maxCnt;
    }

    private static String[][] changeRC(int num, String[][] candies) {
        String temp;
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                temp = candies[i][j];
                candies[i][j] = candies[j][i];
                candies[j][i] = temp;
            }
        }
        return candies;
    }
}
