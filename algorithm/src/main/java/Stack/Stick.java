package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<num; i++){
            stack.push(Integer.parseInt(br.readLine()));
        }
        int temp =0;
        int answer=0;
        for(int i=0; i<num; i++){
            int height = stack.pop();
            if(temp<height){
                temp=height;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
