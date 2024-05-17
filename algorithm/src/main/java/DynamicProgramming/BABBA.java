package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BABBA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        int[] dpA = new int[46];
        int[] dpB = new int[46];

        dpA[0] = 1; dpB[0] =0;

        for(int i=1; i<=K; i++){
            dpA[i] = dpB[i-1];
            dpB[i] = dpA[i-1] + dpB[i-1];
        }

        System.out.println(dpA[K] + " " + dpB[K]);


        /**  아래의 경우 K=45일때 문자의 갯수가 너무 많기때문에 String을 모두 저장하면 매모리 초과가 발생한다. A,B 의 숫자만 저장해서 해결

//        String[] dp = new String[46];


//        dp[0] ="A"; dp[1] = "B"; dp[2] = "BA";
//
//        for(int i =3; i<=K; i++) dp[i] = dp[i-1].replace("A","C").replace("B","BA").replace("C","B");
//
//        System.out.println(dp[K].replace("B","").length()+ " " + dp[K].replace("A","").length());
         **/

    }
}
