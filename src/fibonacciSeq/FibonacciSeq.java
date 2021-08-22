// This is a small Fibonacci sequence generator application. 
// Enjoy!
package fibonacciSeq;

class GFG {
      static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
  
        int Seq = 0;
  
        while ( N >Seq) {
  
            // Print Fibonacci sequence
            System.out.print(num2 + " \n Sequence  ||");
  
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            Seq = Seq;
        }
    }
  
    public static void main(String args[])
    {
        // Given Number N
        int N = 1;
  
        // Function Call
        Fibonacci(N);
    }
}