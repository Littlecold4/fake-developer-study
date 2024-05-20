import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumSubsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int S = Integer.parseInt(input[1]);

        int[] arr = new int[N];
        String[] arrInput = br.readLine().split(" ");
        for(int i =0; i<N ;i++){
            arr[i] = Integer.parseInt(arrInput[i]);
        }
        System.out.println(findArr(arr,0,S,0,0));
    }

    private static int findArr(int[] arr,int index,int S,int cnt,int sum){
        if(arr.length==index) return cnt;

        cnt = findArr(arr,index+1,S,cnt,sum);

        sum += arr[index];
        if(sum == S) cnt++;
        cnt = findArr(arr,index+1,S,cnt,sum);

        return cnt;
    }
}
