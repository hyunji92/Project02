package Fibonacci;

public class FibonacciSequence {
	public static void main(String args[]) {
		int fibonacci, fibonacci2, sum, evens;
		fibonacci = 1;
		fibonacci2 = 1;
		sum = 2;
		evens = 0;
		// 뭔가 많이 비교해야하는데 두개 숫자 시작하고 4000000을 넘으면 안된다...

		while (fibonacci <= 4000000 || fibonacci2 <= 4000000 || sum <= 4000000) {

			if (fibonacci <= 4000000 && fibonacci % 2 == 0) {
				evens = evens + fibonacci;
			}
			if (fibonacci2 <= 4000000 && fibonacci2 % 2 == 0) {
				evens = evens + fibonacci2;
			}
			if (sum <= 4000000 && sum % 2 == 0) {
				evens = evens + sum;
				{
					sum = fibonacci + fibonacci2;
					fibonacci = sum + fibonacci2;
					fibonacci2 = sum + fibonacci;
				}
				System.out.println(fibonacci);
				System.out.println(fibonacci2);
				System.out.println(sum);
				if (fibonacci >= 4000000 || fibonacci2 >= 4000000
						|| sum >= 4000000) {
					break;
				}
			}
		}
		System.out.println("4000000 이하 로의 합입니닷 : ");
		System.out.println(evens);
		// 값은 뭔가 맞게 나오는것 같은데 순서가 제대로 나오지 않는다.......음......
		FibonacciSequence2();
	}

	public static void FibonacciSequence2() {
		int sum = 0;
		int i, calFibo;
		// 길게 쓰기 힘드니 f1으로 ...fibonacci1
		for (i = 1; 1 < 1000; i++) {
			calFibo = fibonacci2(i);
			if (calFibo > 4000000)
				break;
			if (calFibo % 2 == 0)
				sum += calFibo;
		}

		System.out.println("sum : " + sum);

		return;
	}

	public static int fibonacci2(int n) {
		int i;
		int f1 = 1;
		int f2 = 1;
		if (n == 0 || n == 1)
			return f1;
		else {
			for (i = 1; i < n; i++) {
				f1 = f1 + f2;
				f2 = f1 - f2;
			}
			return f1;
		}
	}

	public void FibonacciSequence3() {
		int fibonacci, fibonacci2, sum, evens;
		fibonacci = 0;
		// 0으로 시작하는 것인가....
		fibonacci2 = 1;
		sum = 0;
		evens = 0;
		System.out.println("Fibonacci Sequence2이 고 evens 값이다 :");
		while (sum < 4000000) {
			// 합이 4000000 만 넘지않는것만 우선 비교...?
			sum += fibonacci;
			fibonacci = fibonacci2;
			fibonacci2 = sum;
			if (sum % 2 == 0) {
				System.out.println(sum);
				evens += sum;
			}
		}
		System.out.println("4000000 이하 로의 합입니닷 : " + evens);
	}
}