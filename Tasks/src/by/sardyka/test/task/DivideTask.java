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
		System.out.println(Integer.MIN_VALUE + " / -4 = " + divide(Integer.MIN_VALUE, -4) + " == " + Integer.MIN_VALUE / -4);
		System.out.println(Integer.MIN_VALUE + " / 4 = " + divide(Integer.MIN_VALUE, 4) + " == " + Integer.MIN_VALUE / 4);
		System.out.println(Integer.MAX_VALUE + " / -4 = " + divide(Integer.MAX_VALUE, -4) + " == " + Integer.MAX_VALUE / -4);
		System.out.println(Integer.MAX_VALUE + " / 4 = " + divide(Integer.MAX_VALUE, 4) + " == " + Integer.MAX_VALUE / 4);
		System.out.println("1 / " + Integer.MIN_VALUE + " = " + divide(1, Integer.MIN_VALUE) + " == " + 1 / Integer.MIN_VALUE);
		System.out.println("1 / " + Integer.MAX_VALUE + " = " + divide(1, Integer.MAX_VALUE) + " == " + 1 / Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE +" / " + Integer.MIN_VALUE + " = " + divide(Integer.MIN_VALUE, Integer.MIN_VALUE) + " == " + Integer.MIN_VALUE/ Integer.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE +" / " + Integer.MAX_VALUE + " = " + divide(Integer.MIN_VALUE, Integer.MAX_VALUE) + " == " + Integer.MIN_VALUE/ Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE +" / " + Integer.MIN_VALUE + " = " + divide(Integer.MAX_VALUE, Integer.MIN_VALUE) + " == " + Integer.MAX_VALUE/ Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE +" / " + Integer.MAX_VALUE + " = " + divide(Integer.MAX_VALUE, Integer.MAX_VALUE) + " == " + Integer.MAX_VALUE/ Integer.MAX_VALUE);
		System.out.println("-1 / " + Integer.MIN_VALUE + " = " + divide(-1, Integer.MIN_VALUE) + " == " + (-1)/ Integer.MIN_VALUE);
		System.out.println("-1 / " + Integer.MAX_VALUE + " = " + divide(-1, Integer.MAX_VALUE) + " == " + (-1)/ Integer.MAX_VALUE);
		System.out.print("10 / 0 = ");Thread.sleep(20);System.out.print(divide(10, 0));
	}

	static int divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("b = 0");
		}
		long i = 1;
		long aValue = a;
		long bValue = b;
		boolean sign = false;
		if (bValue < 0) {
			sign = true;
			bValue = -bValue;
		}
		if (aValue < 0) {
			sign = !sign;
			aValue = -aValue;
		}
		while (bValue * i <= aValue) {
			i++;
		}
		int result = (int)(i - 1) * (sign ? -1 : 1);
		return result;
	}

}
