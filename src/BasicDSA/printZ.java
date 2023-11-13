package BasicDSA;

public class printZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		for (int i = 0; i < a; i++) {
			int val = a - i;
			for (int j = 0; j < a; j++) {
				if (i == 0 || i == a - 1) {
					System.out.print("* ");
				} else {
					if (val == j) {
						System.out.print("* ");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
		}
	}
}
