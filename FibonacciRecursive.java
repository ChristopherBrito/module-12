public class FibonacciRecursive {

public static void main(String[] args) {
int n = 10;
        for (int i = 0; i < n; i++){ System.out.print(fib(i) + " "); }
        System.out.println("\nThe Fibanacci series of " + n + " is " + fib(n));
}
public static int fib(int n){ 
	    if (n == 0) return 0; 
	    else if (n == 1) return 1; 
	    return fib(n - 1) + fib(n - 2);
	}
}
