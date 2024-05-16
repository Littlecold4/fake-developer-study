import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Editor {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        int nowLength = word.length();
        int cursorPosition = word.length();
        int N = Integer.parseInt(br.readLine());
        for(int i =0; i<N; i++){
            String[] input = br.readLine().split(" ");
            if(input.length==1){
                if(input[0].equals("L")&&cursorPosition!= 0) cursorPosition--;
                if(input[0].equals("D")&&cursorPosition!=nowLength) cursorPosition++;
                if(input[0].equals("B")&&cursorPosition!=0){
                    if(cursorPosition==nowLength) word = word.substring(0,cursorPosition-1);
                    else  word = word.substring(0,cursorPosition-1) + word.substring(cursorPosition);
                    cursorPosition--;
                    nowLength--;
                }
            }
            else {
                word = word.substring(0,cursorPosition)+input[1] + word.substring(cursorPosition);
                cursorPosition++;
                nowLength++;
            }
        }
        bufferedWriter.write(word);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
