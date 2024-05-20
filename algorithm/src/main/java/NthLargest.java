import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NthLargest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[N * N];
//        ArrayList arr1 = new ArrayList();

        for(int i =0; i<N; i++){
            String[] input = br.readLine().split(" ");
            for(int j=0; j<N; j++){
                arr[N*i+j] = Integer.parseInt(input[j]);
            }
        }
        List<Integer> arrayList = Arrays.asList(arr);
        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println(arrayList.get(N-1));
    }
}
