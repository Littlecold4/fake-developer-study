package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Body {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] body =new int[num][2];
        for(int i=0; i<num; i++){
            String[] bodyStr = br.readLine().split(" ");
            body[i][0] = Integer.parseInt(bodyStr[0]);
            body[i][1] = Integer.parseInt(bodyStr[1]);
        }
        StringBuffer sb = new StringBuffer();
        int ranking;
        for(int i=0; i<num; i++){
            ranking=0;
            for(int j=0; j<num; j++){
                if(body[i][0]<body[j][0] && body[i][1]<body[j][1]) ranking++;
            }
            sb.append(ranking+1).append("\n");
        }
        System.out.println(sb);
    }
}
