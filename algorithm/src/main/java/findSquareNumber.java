import java.io.BufferedReader;
import java.io.InputStreamReader;

public class findSquareNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NnM = br.readLine();
        int N = Integer.parseInt(NnM.split(" ")[0]);
        int M = Integer.parseInt(NnM.split(" ")[1]);
        String square="";
        for(int i=0; i<N; i++){
            square+= br.readLine();
        }
        String[] splitNum = square.split("");
        int length=square.length();
        int answer = 0;
        for(int i=0; i<length; i++){
            for(int j=1; j<length; j++){
                String squareNumStr="";
                for(int m=0; i+j*m<length; m++){
                    squareNumStr += splitNum[i+j*m];
//                    System.out.println(squareNumStr);
                    if(squareNumStr.length() >=Math.max(N,M)) break;
                    double squareNum = Math.sqrt(Long.parseLong(squareNumStr));
                    if(squareNum==(int)squareNum && answer<squareNum){
                        answer = (int)squareNum;
                    }
                }
            }
        }

        System.out.println("answer="+answer);
        for(int i=length-1; i>=0; i--){
            for(int j=1; j<length; j++){
                String squareNumStr="";
                for(int m=0; i-j*m>=0; m++){
                    squareNumStr += splitNum[i-j*m];
                    if(squareNumStr.length() >=Math.max(N,M)) break;
                    double squareNum = Math.sqrt(Long.parseLong(squareNumStr));
                    if(squareNum==(int)squareNum && answer<squareNum){
                        System.out.println("sqareNum = " + squareNum);
                        System.out.println("squreNumStr = " + squareNumStr);
                        answer = (int)squareNum;
                    }
                }
            }
        }
        System.out.println("answer="+answer);
    }
}
