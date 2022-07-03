package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EatOrEaten {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int j=0; j<num; j++){
            String[] numStr=  br.readLine().split(" ");
            int Anum = Integer.parseInt(numStr[0]);
            int Bnum = Integer.parseInt(numStr[1]);
            int[] Anums = new int[Anum];
            int[] Bnums = new int[Bnum];
            String[] AnumStrs = br.readLine().split(" ");
            for(int i=0; i<Anum; i++){
                Anums[i] = Integer.parseInt(AnumStrs[i]);
            }
            String[] BnumStrs = br.readLine().split(" ");
            for(int i=0; i<Bnum; i++){
                Bnums[i] = Integer.parseInt(BnumStrs[i]);
            }
            int answer =0;
            Arrays.sort(Anums);
            Arrays.sort(Bnums);
            for(int i=Anum-1; i>=0; i--){
                for(int k=0; k<Bnum; k++){
                    if(Anums[i]>Bnums[k]){
                        answer++;
                    }else break;
                }
            }
            System.out.println(answer);
        }
    }
}
