import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            left.push(str.charAt(i));
        }
        
        int tc = Integer.parseInt(br.readLine());
        for (int t = 0; t < tc; t++) {
            String input = br.readLine();
            
            if (input.charAt(0) == 'L') {
                if (!left.isEmpty()) {
                    right.push(left.pop());    
                }
            } else if (input.charAt(0) == 'D') {
                if (!right.isEmpty()) {
                    left.push(right.pop());    
                }
            } else if (input.charAt(0) == 'B') {
                if (!left.isEmpty()) {
                    left.pop();
                }
            } else if (input.charAt(0) == 'P') {
                left.push(input.charAt(2));
            }
        }
        
        while (!left.isEmpty()) {
            right.push(left.pop());    
        }
        StringBuilder sb = new StringBuilder();
        while (!right.isEmpty()) {
            sb.append(right.pop());
        }
        System.out.println(sb);
        
        br.close();
    }
}