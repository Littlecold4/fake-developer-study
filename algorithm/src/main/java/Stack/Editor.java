package Stack;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Editor {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] word = br.readLine().split("");
        int N = Integer.parseInt(br.readLine());

        java.util.Stack<String> leftStack = new java.util.Stack<String>();
        java.util.Stack<String> rightStack = new Stack<String>();

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
