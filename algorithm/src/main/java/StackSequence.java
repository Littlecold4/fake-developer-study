import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();
        StringBuilder answer = new StringBuilder();

        int now = 1;
        for(int i=1; i<=n; i++){
            int input = Integer.parseInt(br.readLine());
            if(input>=now){
                for(int j=now; j<=input; j++){
                    s.push(j);
                    answer.append("+" + "\n");

                }
                now=input+1;
                s.pop();
                answer.append("-" + "\n");
            }else{
                int num = s.pop();
                if(num!=input) {
                    System.out.println("NO");
                    return;
                }
                answer.append("-" + "\n");
            }
        }
        System.out.println(answer);
    }
}
