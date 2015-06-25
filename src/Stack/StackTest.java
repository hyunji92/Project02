package Stack;

public class StackTest {

	public static void main(String[] args) {

		// 크기 5의 배열 스택 생성
		StackPractice stackPractice = new StackPractice(5);

		System.out.println("Array Stack 테스트");

		// 스택에 데이터 삽입
		for (int i = 1; i <= 5; i++) {
			stackPractice.push("ArrayStack 데이터-" + i);
		}

		System.out.println(stackPractice.pop());
		System.out.println(stackPractice.pop());
		System.out.println(stackPractice.peek());
		System.out.println(stackPractice.peek());
		System.out.println(stackPractice.pop());
		System.out.println(stackPractice.pop());
		System.out.println(stackPractice.pop());

		System.out.println();
		System.out.println(“slack #github 채널 다시 push합니다.”);

	}

}
