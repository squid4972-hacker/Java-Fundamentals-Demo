package Fibonacci;
/**
 * @author enayalaborn
 * @Version 1.1.1
 * @Date 30 May 2026
 * This class is a single-threaded implementation of the Fibonacci sequence, 
 * the purpose is a demonstration of which program would perform better? Please see class "FibonacciMulti"
 */
public class FibonacciIterative { 
	public static void main(String[] args) { 

		int n = 10; 

		long t1 = 0, t2 = 1; 

		for (int i = 1; i <= n; ++i) { 

				System.out.print(t1 + " "); 
				long sum = t1 + t2; t1 = t2; t2 = sum; } } 
}
