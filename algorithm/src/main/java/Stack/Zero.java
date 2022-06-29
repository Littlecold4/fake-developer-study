package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int zeros=0;
        for(int i=0 ; i<num; i++){
            int number = Integer.parseInt(br.readLine());
            if(number==0){
                stack.pop();
                zeros++;
            }else{
                stack.push(number);
            }
        }
        int answer=0;
        for(int i=0; i<num-2*zeros; i++){
            answer+=stack.pop();
        }
        System.out.println(answer);
    }
}
