package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class SortInside {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        StringBuilder sb = new StringBuilder();
        int size =num.length();
        Character[] numChar = new Character[size];
        for(int i=0; i<size; i++){
            numChar[i] = num.charAt(i);
        }
        Arrays.sort(numChar, Collections.reverseOrder());
        for(int i=0; i<size; i++){
            sb.append(numChar[i]);
        }
        System.out.println(sb);
    }
}
