package test08_structure;

public class IntStack {
		// 배열을 이용하여 스택기능의 데이터를 관리한다.
		int stack[];
		// 스택의 크기
		int max;
		// 스택의 포인트 - 스택에 담을 수 있는 위치값을 가진다.
		int pointer;
		
		
		
		// 크기를 지정하지 않을 경우 20개의 데이터를 담을 수 있도록 배열을 생성하고
		
		public IntStack() {
			this(20);
		}
			// capacity크기 만큼 배열을 생성한다.
			
		public IntStack(int capacity) {
			try {
				stack = new int[capacity];
				max = capacity;
				pointer = 0;
			}catch(OutOfMemoryError oome) {
				max = 0; // 스택의 크기
			}
		}
		
		// ------------------------------------------
		// -- 데이터의 수
		public int size() {
			return pointer;
		}
		public int capacity() {
			return max;
		}
		
		public int push(int data) {
			// 이미 stack가득찼는지 확인 후 예외 발생시킴
			if(max <= pointer) {
			throw new OverflowIntStackException();
			}
			return stack[pointer++] = data;
		}
		
		public int pop() {
			// 스택이 비어있는 경우 pointer <= 0
			if(pointer <= 0) {
				throw new EmptyIntStackException();
			}
			return stack[--pointer];
		}
		// 마지막에 담은 데이터 - 제일 위에 있는 값
		public int peek() {
			if(pointer == 0) {
				throw new EmptyIntStackException();
			}
			return stack[pointer-1];
		}
		// 스택을 나중에 입력한 순서로 문자열 만들기
		public String dump() {
			// pointer-1            0
			// [12,      65,       87]    []
			String stackData = "[";
			for(int i = pointer-1; i >=0; i--) { // 2,1,0
				stackData += stack[i];
				if(i>0) stackData += ", ";
			}
			stackData += "]";
			return stackData;
		}
		// 찾고자 하는 값의 index 구하기
		public int indexOf(int data) {
			for(int i = pointer-1; i>=0; i--) {
				if(stack[i] == data) {
					return i;
				}
			}
			return -1; //스택에 값이 없을때
		}
		
		// 스택의 모든 데이터 지우기
		public void clear() {
			pointer = 0;
		}
		
		public boolean isEmpty() {
			// if(pointer == 0) return true;
			if(size() == 0) return true;
			else return false;
		}
		public boolean isFull() {
			if(max == pointer) return true;
			else return false;
		}
		// 데이터삭제 : true, 삭제못함 : false
		public boolean remove(int data) {
			// 스택이 비어있으면 삭제할 데이터가 없다.
			if(isEmpty()) return false;
			
			// 스택에 값은 있으나 삭제 할 값이 없을때
			int idx = indexOf(data);
			if(idx == -1) return false;
			pointer--;
			
			for(int i = idx; i<pointer; i++) { // 1,2,3,               4      
				stack[i] = stack[i+1];
			}
				return true;
		}
		
		
		
		// ---------------------------------------------------
		// 데이터가 넘칠때 발생시킬 내부클래스
		public class OverflowIntStackException extends RuntimeException {
			public OverflowIntStackException() { 
			super("Overflow가 발생하였습니다");
			};
		}
		
		// 데이터가 비어있을때 발생시킬 내부클래스
		public class EmptyIntStackException extends RuntimeException{
			public EmptyIntStackException(){
			super("stack이 비었습니다.");
		}
		
		};
		

	}


