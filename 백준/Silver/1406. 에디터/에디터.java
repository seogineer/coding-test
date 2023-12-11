import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        
        String input = br.readLine();
        for(int i = 0; i < input.length(); i++){
            left.push(input.charAt(i));
        }
        
        int N = Integer.parseInt(br.readLine());
        for(int t = 0; t < N; t++){
            String command = br.readLine();

            if('L' == command.charAt(0)){
                if(!left.isEmpty()){
                    right.push(left.pop());
                }
            }
            if('D' == command.charAt(0)){
                if(!right.isEmpty()){
                    left.push(right.pop());
                }
            }
            if('B' == command.charAt(0)){
                if(!left.isEmpty()) {
                    left.pop();
                }
            }
            if('P' == command.charAt(0)){
                left.push(command.charAt(2));
            }
        }
        
        while(!left.isEmpty()){
            right.push(left.pop());
        }
        StringBuilder sb = new StringBuilder();
        while(!right.isEmpty()){
            sb.append(right.pop());
        }
        System.out.println(sb.toString());
        
        br.close();
    }
}