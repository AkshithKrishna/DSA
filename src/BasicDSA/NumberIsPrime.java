package BasicDSA;

public class NumberIsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[] = { 2, 4, 5, 6, 7, 8, 9 };
//		isPrime(a);
		primeNumberRange(10);
	}

	public static void isPrime(int num[]) {
		for (int itr = 0; itr < num.length; itr++) {
			boolean flag = false;
			for (int i = 2; i <= num[itr] / 2; i++) {
				if (num[itr] % i == 0) {
					flag = true;
				}
			}
			if (flag) {
				System.out.println("not a prime number");
			} else {
				System.out.println("prime number");
			}
		}
	}

	public static void primeNumberRange(int n) {
		for (int itr = 1; itr <= n; itr++) {
			boolean flag = false;
			for (int i = 2; i <= itr / 2; i++) {
				if (itr % i == 0) {
					flag = true;
				}
			}
			if (flag) {
				System.out.println("not a prime number");
			} else {
				System.out.println(itr);
				System.out.println("prime number");
			}
		}
	}
}
