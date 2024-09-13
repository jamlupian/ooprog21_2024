public class Fibo {
    public static void main(String[] args) {
      int n = 10; 
      int v1 = 0, v2 = 1;
      int sum;
      
      for (int i = 0; i <= n; i++) {
        System.out.println( "fibonacci("+i+") -> "+v1);
        sum = v1 + v2;
        v1 = v2;
        v2 = sum;
      }
    }
  }