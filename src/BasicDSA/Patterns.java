package BasicDSA;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern4(5);
	}

//	*
//	**
//	***
//	****
	public static void pattern1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

//	****
//	***
//	**
//	*
	public static void pattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

//	    *
//	   **
//	  ***
//	 ****
	public static void pattern3(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//	****
//	 ***
//	  **
//	   *
	public static void pattern4(int n) {
		for (int i = 0; i < n; i++) {
			for (int space = 0; space < i; space++) {
				System.out.print(" ");
			}
			for (int star = 0; star < n - i; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
