package hanahaeTest;

public class reversePlus {
    public String solution(int n) {
        String answer = "";
        String num = String.valueOf(n);
        int sum = 0;
        for(int i=num.length()-1; i>=0; i--) {
            sum += num.charAt(i)-'0';
            answer += num.charAt(i) +"+";
        }
        answer +=String.valueOf(sum);
        return answer;
    }

    public static void main(String[] args) {
        reversePlus method = new reversePlus();
        System.out.println(method.solution(718253));
    }
}

