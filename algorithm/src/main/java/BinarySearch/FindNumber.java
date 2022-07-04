package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        List<String> inputs = new ArrayList<>();
        String[] inputStr = br.readLine().split(" ");
        for (int i = 0; i < inputNum; i++) {
            inputs.add(inputStr[i]);
        }
        Collections.sort(inputs);
        int compareNum = Integer.parseInt(br.readLine());
        String[] outputStr = br.readLine().split(" ");
        List<String> outputs = new ArrayList<>();
        for (int i = 0; i < compareNum; i++) {
            outputs.add(outputStr[i]);
        }
        StringBuffer sb = new StringBuffer();
        int mid = 0;
        for (int i = 0; i < compareNum; i++) {
            int start = 0;
            int end = inputNum-1;
            while (true) {
                mid = (start+end)/2;
                if(start>end){
                    sb.append(0).append("\n");
                    break;
                }
                if (outputs.get(i) .compareTo( inputs.get(mid))>0) {
                    start = mid+1;
                } else if (outputs.get(i) .equals( inputs.get(mid))) {
                    sb.append(1).append("\n");
                    break;
                } else {
                    end = mid-1;
                }
            }
        }
            System.out.println(sb);
    }
}

