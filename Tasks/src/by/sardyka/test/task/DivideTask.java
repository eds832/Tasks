package by.sardyka.test.task;

public class DivideTask {
	public static void main(String[] arg) {
		System.out.println(divide(10, 3));
	}

	static int divide(int a, int b) {
		int i = 1;
		if (b == 0) {
			throw new RuntimeException("b = 0");
		}
		boolean sign = false;
		if (b < 0) {
			sign = true;
			b = -b;
		}
		boolean signA = false;
		if (a < 0) {
			signA = true;
			a = -a;
		}
		while (b * i <= a) {
			i++;
		}
		return (i - 1) * (sign == true ? 1 : -1) * (signA == true ? 1 : -1);
	}

}
