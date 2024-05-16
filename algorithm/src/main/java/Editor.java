import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
public class Editor {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
        System.out.println(word);
    }
}
 위 방법으로는 성공하였으나 시간초과의 문제를 해결하지 못함
 ->시간초과 문제를 해결하기 위해서는 Stack을 사용해야함 Stack은 모든 삽입 수정 연산이 O(1)의 시간 복잡도를 가짐
 **/
public class Editor {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] word = br.readLine().split("");
        int N = Integer.parseInt(br.readLine());

        Stack<String> leftStack = new Stack<String>();
        Stack<String> rightStack = new Stack<String>();

        for(String w : word) leftStack.push(w);

        for(int i=0; i<N; i++){
            String command = br.readLine();
            String command1 =command.split(" ")[0];

            switch (command1){
                case "L" :
                    if(!leftStack.isEmpty()) rightStack.push(leftStack.pop()); break;

                case "D" :
                    if(!rightStack.isEmpty()) leftStack.push(rightStack.pop()); break;

                case "B" :
                    if(!leftStack.isEmpty()) leftStack.pop(); break;

                case "P" :
                    String command2 = command.split(" ")[1];
                    leftStack.push(command2); break;
            }
        }

        while(!leftStack.isEmpty()) rightStack.push(leftStack.pop());
        while(!rightStack.isEmpty()) bw.write(rightStack.pop());

        bw.flush();
        bw.close();
    }
}
