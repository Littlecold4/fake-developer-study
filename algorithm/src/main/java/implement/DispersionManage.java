package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DispersionManage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(br.readLine());
        int[][] cases = new int[nums][2];
        for(int i=0; i<nums; i++){
            String[] ranking = br.readLine().split(" ");
            cases[i][0] = Integer.parseInt(ranking[0]);
            cases[i][1] = Integer.parseInt(ranking[1]);
        }
        for(int i=0; i<nums; i++){
            int num = cases[i][0];
            int temp = 1;
            for(int j=0; j<cases[i][1]; j++){
                temp *=num;
                temp %=10;
            }
            if(temp ==0 ) temp =10;
            System.out.println(temp);
        }
    }

}
