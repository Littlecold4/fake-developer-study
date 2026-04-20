import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShareBurger {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] NnKStr =br.readLine().split(" ");
        int N = Integer.parseInt(NnKStr[0]);
        int K = Integer.parseInt(NnKStr[1]);

        String[] burger =br.readLine().split("");

        int answer = 0;
        for(int j=0; j<burger.length; j++){
            if (burger[j].equals("P")){
                int start = Math.max(0, j - K);
                int end = Math.min(burger.length- 1, j + K);
                for(int i=start; i<=end ; i++){
                    if(burger[i].equals("H")){
                        burger[i] = "X";
                        answer++;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);

    }
}
