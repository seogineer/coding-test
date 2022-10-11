import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Stack<String> left = new Stack<>();
    Stack<String> right = new Stack<>();

    String input = br.readLine();
    for (int i = 0; i < input.length(); i++) {
      left.push(input.charAt(i) + "");
    }

    int tc = Integer.parseInt(br.readLine());
    for (int i = 0; i < tc; i++) {
      String[] command = br.readLine().split(" ");

      if (command.length > 1) {
        left.push(command[1]);
      } else {
        if (command[0].equals("L")) {
          if (!left.isEmpty()) {
            right.push(left.pop());
          }
        }
        if (command[0].equals("D")) {
          if (!right.isEmpty()) {
            left.push(right.pop());
          }
        }
        if (command[0].equals("B")) {
          if (!left.isEmpty()) {
            left.pop();
          }
        }
      }
    }

    while(!left.isEmpty())
			right.push(left.pop());
		
    while(!right.isEmpty())
			bw.write(right.pop());

    bw.flush();
    bw.close();
  }
}