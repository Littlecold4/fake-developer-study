package hanahaeTest;

import java.util.Arrays;

public class PlusOrMinus {
    public int[][] solution(int[][] arr1, int[][] arr2, boolean[][] signs) {
        int[][] answer = arr1;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
                if (signs[i][j] == false) answer[i][j] *= -1;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        PlusOrMinus method = new PlusOrMinus();
        int[][] arr1 = {{5, 7, 1}, {2, 3, 5}};
        int[][] arr2 = {{5, 1, 6}, {7, 5, 6}};
        boolean[][] signs = {{true, true, false}, {false, true, false}};
        System.out.println(Arrays.deepToString(method.solution(arr1, arr2, signs)));
    }
}

