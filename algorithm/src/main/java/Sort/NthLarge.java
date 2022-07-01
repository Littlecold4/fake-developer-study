package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NthLarge {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb =new StringBuilder();
        for(int i=0; i<num; i++){
            String[] numberStr = br.readLine().split(" ");
            int[] numbers = new int[10];
            for(int j=0; j<10; j++){
                numbers[j] = Integer.parseInt(numberStr[j]);
            }
            Arrays.sort(numbers);
            sb.append(numbers[7]).append("\n");
        }
        System.out.println(sb);
    }
}
