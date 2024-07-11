import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SteelStick {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        int temp = 0;
        for(int i=0; i<input.length(); i++){
            char word = input.charAt(i);
            if(word=='(') {
                temp=0;
                stack.push('(');
            }
            else{
                if(temp == 1 ){
                    stack.pop();
                    ans++;
                }else {
                    ans += stack.size()-1;
                    stack.pop();
                    temp=1;
                }
            }
        }
        System.out.println(ans);
    }
}
