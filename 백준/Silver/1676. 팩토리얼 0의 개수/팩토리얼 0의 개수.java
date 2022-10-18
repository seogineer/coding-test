import java.util.*;
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    
    BigInteger factorial = new BigInteger("1");
    for(int i = input; i > 0; i--){
      factorial = factorial.multiply(new BigInteger("" + i + ""));
    }

    int zeroCount = 0;
    String strFactorial = String.valueOf(factorial);
    for(int i = strFactorial.length() - 1; i >= 0; i--){
      if(strFactorial.charAt(i) == '0'){
        zeroCount++;
        continue;
      }
      break;
    }
    
    System.out.println(zeroCount);
    sc.close();
  }
}