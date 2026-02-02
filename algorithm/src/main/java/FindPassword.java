import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FindPassword {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] NnMStr = br.readLine().split(" ");
        int N = Integer.parseInt(NnMStr[0]);
        int M = Integer.parseInt(NnMStr[1]);

        Map<String,String> map = new HashMap<>();

        for(int i = 0 ; i<N; i++){
            String[] input = br.readLine().split(" ");
            map.put(input[0],input[1]);
        }

        for(int i =0 ;i<M ;i++){
            String site = br.readLine();
            bw.write(map.get(site)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
