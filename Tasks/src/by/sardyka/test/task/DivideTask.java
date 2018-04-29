package by.sardyka.test.task;

public class DivideTask {
	public static void main(String[] arg) throws InterruptedException {
		System.out.println("10 / 3 = " + divide(10, 3) + " == " + 10 / 3);
		System.out.println("-10 / 3 = " + divide(-10, 3) + " == " + (-10 / 3));
		System.out.println("10 / -3 = " + divide(10, -3) + " == " + 10 / -3);
		System.out.println("10 / 1 = " + divide(10, 1) + " == " + 10 / 1);
		System.out.println("10 / 100 = " + divide(10, 100) + " == " + 10 / 100);
		System.out.println(Integer.MAX_VALUE +  " / 1 = " + divide(Integer.MAX_VALUE, 1) + " == " + Integer.MAX_VALUE / 1);
		System.out.println((Integer.MIN_VALUE + 1) + " / -1 = " + divide((Integer.MIN_VALUE + 1), -1) + " == " + (Integer.MIN_VALUE + 1) / -1);
		System.out.println(Integer.MIN_VALUE + " / 1 = " + divide(Integer.MIN_VALUE, 1) + " == " + Integer.MIN_VALUE / 1);
		System.out.println(Integer.MIN_VALUE + " / -1 = " + divide(Integer.MIN_VALUE, -1) + " == " + Integer.MIN_VALUE / -1);
		Thread.sleep(10);
		System.out.print("10 / 0 = ");System.out.print(divide(10, 0));
	}

	static int divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("b = 0");
		}
		int i = 1;
		boolean sign = false;
		if (b < 0) {
			sign = true;
			b = -b;
		}
		if(b == 1) {
			if(a == Integer.MAX_VALUE) {
				return a * (sign ? -1 : 1);
			}
			if(a == Integer.MIN_VALUE + 1) {
				return a * (sign ? -1 : 1);
			}
			if(a == Integer.MIN_VALUE) {
				return a;
			}
		}
		if (a < 0) {
			sign = !sign;
			a = -a;
		}
		while (b * i <= a) {
			i++;
		}
		return (i - 1) * (sign ? -1 : 1);
	}

}
