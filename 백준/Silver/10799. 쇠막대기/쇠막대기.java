import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        String input = br.readLine();
        
        int answer = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(input.charAt(i));
            } else {
                stack.pop();
                if (input.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else {
                    answer += 1;
                }
            }
        }
        
        System.out.println(answer);
        br.close();
    }
}