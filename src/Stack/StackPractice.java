package Stack;

public class StackPractice {

	private int top;
	private int maxSize;
	private Object[] stackArray;

	// 배열 스택 생성, 스택의 최대 크기로 생성
	public StackPractice(int maxSize) {

		this.maxSize = maxSize;
		this.stackArray = new Object[maxSize];
		initStack();
	}

	public void initStack() {
		// top
		this.top = -1;
		// top값을 초기에 -1로 정의하는것 스택에 데이터가 아무것도 없다는것이다.
		// 이는 배열이 0 부터 시작하므로 top이 -1 완전 비었다는것을 의미하고 , 0이라면 하나의 data가 있다는 것이 된다.
		// 처음에는 무작정 0으로 정의하여 그것이 비어있는것있줄 알았으나 수정.
	}

	// 스택이 비어있는지 체크
	public boolean empty() {
		return (top == -1);
	}

	// 스택에 입력
	public void push(Object item) {

		if (top >= maxSize - 1) { // 꽉꽉 찼니? 
			// 배열의 크기가 MAX일 때 마지막 요소는 MAX의 -1이 된다.
			// 그래서 top이 MAX에서 -1이 되었을 때가 스택이 꽉찬 상태인것.
			System.out.println("\n Stack overflow");
			return;
		}
		stackArray[++top] = item;
	}
	// 스택의 가장 위의 데이터 제거
		public Object pop() {

			Object item = peek();

			top--;

			return item;
		}

	// 스택의 가장 위의 데이터 반환
	public Object peek() {
		return stackArray[top];
	}


}
