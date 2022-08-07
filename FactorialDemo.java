
public class FactorialDemo {

	public static void main(String[] args) {

		int num = 5;

		System.out.println(factor(num));

	}

	private static int factor(int n) {
		if (n == 0)
			return 1;
//		else if (n < 0)
//			return -1;
		
		else if (n > 2)
			return n * factor(n - 1);
		return n;
		
//		else if (n < 2)
//			return 1;		
//		return n * factor(n - 1);
	}

}
