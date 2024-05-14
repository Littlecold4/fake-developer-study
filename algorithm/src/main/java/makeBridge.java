import java.io.BufferedReader;
import java.io.InputStreamReader;

public class makeBridge {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for(int t = 0; t<testCase; t++){
            String NnM = br.readLine();
            int N = Integer.parseInt(NnM.split(" ")[0]);
            int M = Integer.parseInt(NnM.split(" ")[1]);
            if(N<M){
                System.out.println("0");
                continue;
            }
            
        }

    }
}
