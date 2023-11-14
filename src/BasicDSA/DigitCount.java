package BasicDSA;

public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 99999;
		int rem, rev, count = 0;
		while (n != 0) {
			rem = n % 10;
			count++;
			n = n / 10;
		}
		System.out.println(count);
	}

}
