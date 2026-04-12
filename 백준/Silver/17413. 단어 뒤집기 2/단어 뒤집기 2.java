import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        String input = br.readLine();
        
        boolean isTag = false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (c == '<') {
                while (!s.isEmpty()) {
                    sb.append(s.pop());
                }
                isTag = true;
            }
            
            if (!isTag && c == ' ') {
                while (!s.isEmpty()) {
                    sb.append(s.pop());
                }
                sb.append(c);
                continue;
            }
            
            if (isTag) {
                sb.append(c);
            } else {
                s.push(c);
            }
            
            if (c == '>') {
                isTag = false;
            }
        }
        
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        System.out.println(sb);
        br.close();
    }
}