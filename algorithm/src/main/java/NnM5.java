import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NnM5 {
    static int N;
    static int M;
    static int[] nums;
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] NnmStr = br.readLine().split(" ");
        N = Integer.parseInt(NnmStr[0]);
        M = Integer.parseInt(NnmStr[1]);

        nums = new int[N];
        String[] numStr = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(numStr[i]);
        }

        Arrays.sort(nums);
        for(int i=0; i<N; i++){
            func(1,"",i);
        }
    }

    private static void func(int depth,String ans,int num){
        if(depth==M){
            System.out.println(ans);
            return;
        }
        depth++;
        ans+= " "+nums[num];
        for(int j =0; j<N; j++){
            func(depth,ans,j);
        }
    }
}
