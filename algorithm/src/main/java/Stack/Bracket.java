package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        for(int i=0; i<num; i++){
            String answer= "YES";
            String a =br.readLine();
            stack.clear();
            for(int j=0; j<a.length(); j++){
                if(a.charAt(j)=='('){
                    stack.push("(");
                }else{
                    if(stack.empty()){
                        answer="NO";
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }
            if(stack.size()>0) {
                System.out.println("NO");
            }
            else System.out.println(answer);
        }
    }
}
