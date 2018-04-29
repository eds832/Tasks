package by.sardyka.test.task;

public class DivideTask {
	public static void main(String[] arg) {
		System.out.println("10 / 3 = " + divide(10, 3));
		System.out.println("-10 / 3 = " + divide(-10, 3));
		System.out.println("10 / -3 = " + divide(10, -3));
		System.out.println("10 / 1 = " + divide(10, 1));
		System.out.println("10 / 100 = " + divide(10, 100));
		System.out.println("10 / 0 = " + divide(10, 0));
	}

	static int divide(int a, int b) {
		if (b == 0) {
			throw new RuntimeException("b = 0");
		}
		int i = 1;
		boolean sign = false;
		if (b < 0) {
			sign = true;
			b = -b;
		}
		if (a < 0) {
			sign = !sign;
			a = -a;
		}
		while (b * i <= a) {
			i++;
		}
		return (i - 1) * (sign == true ? -1 : 1);
	}

}
