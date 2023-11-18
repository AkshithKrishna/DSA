package BasicDSA;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		FibonacciNumber fib=new FibonacciNumber();
		fib.fibonacci(n);
	}

	public void fibonacci(int n) {
		int sum = 0;
		int a = 0, b = 1;
		System.out.print(a);
		System.out.print(b);
		for (int i = 2; i < n; i++) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.print(sum);
		}
	}

}
