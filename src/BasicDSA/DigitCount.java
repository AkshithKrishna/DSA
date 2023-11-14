package BasicDSA;

public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345678;
		digitCountAndDigitExtract(n);
		reverseNumber(1234);
	}

	public static void digitCountAndDigitExtract(int n) {
		int rem, rev, count = 0;
		while (n != 0) {
			rem = n % 10;
			System.out.println(rem);
			count++;
			n = n / 10;
		}
		System.out.println(count);
	}

	public static void reverseNumber(int n) {
		int rem, rev = 0;
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println(rev);
	}
}
