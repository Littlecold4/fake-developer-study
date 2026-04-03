import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Olympics {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] NnKStr = br.readLine().split(" ");
        int N = Integer.parseInt(NnKStr[0]);
        int K = Integer.parseInt(NnKStr[1]);

        int[][] medals = new int[N][4];
        int index=0;
        for(int i=0; i<N; i++){
            String[] input =br.readLine().split(" ");
            medals[i][0]= Integer.parseInt(input[0]);
            medals[i][1]= Integer.parseInt(input[1]);
            medals[i][2]= Integer.parseInt(input[2]);
            medals[i][3]= Integer.parseInt(input[3]);
            if(medals[i][0] == K ) index=i;
        }
        int[] target = medals[index];
        int answer = 1;
        for(int i=0; i<N; i++) {
            if(medals[i][1] > target[1]) answer++;
            if(medals[i][1] == target[1] && medals[i][2] > target[2]) answer++;
            if(medals[i][1] == target[1] && medals[i][2] == target[2] &&medals[i][3] >target[3]) answer++;
        }
        System.out.println(answer);
    }
}
