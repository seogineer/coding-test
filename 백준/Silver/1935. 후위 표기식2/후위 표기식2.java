import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int tc = Integer.parseInt(sc.nextLine());
    String input = sc.nextLine();
    double[] value = new double[tc];
    for(int t = 0; t < tc; t++){
      value[t] = Double.parseDouble(sc.nextLine());
    }

    Stack<Double> stack = new Stack<>();
    for(int i = 0; i < input.length(); i++){
      if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z'){
        stack.push(value[input.charAt(i) - 65]);        
      } else {
        if(input.charAt(i) == '+'){
          double value1 = stack.pop();
          double value2 = stack.pop();
          stack.push(value2 + value1);
          continue;
        }
        if(input.charAt(i) == '-'){
          double value1 = stack.pop();
          double value2 = stack.pop();
          stack.push(value2 - value1);
          continue;
        }
        if(input.charAt(i) == '*'){
          double value1 = stack.pop();
          double value2 = stack.pop();
          stack.push(value2 * value1);
          continue;
        }
        if(input.charAt(i) == '/'){
          double value1 = stack.pop();
          double value2 = stack.pop();
          stack.push(value2 / value1);
          continue;
        }
      }
    }

    System.out.println(String.format("%.2f", stack.pop()));
  }
}