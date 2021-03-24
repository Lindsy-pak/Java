package sec06.exam01;

public class IntExample {
	public static void main(String[] args) {
		/*
		 * 정수 타입 4가지
		 */
		byte b = 10; //1
		short s = 20; //2
		int i = 30; //4
		long l = 40; //8 -> 예시로 든 숫자임
//		숫자 저장할 수 있는 크기가 다르다. 밑으로 갈수록 단위가 크다.
		char c = 'a'; // 한개!!의 문자만!! 저장하는 타입 두개이상은 x
		
		// 자동형변환
		s = (short)b; // 형변환 () : 문제가 없으면 자동형변환이 된다. 이 경우는 자동 형변환이 된다.
		s = (short)i; // (강제)수동으로 형변환을 해주어야한다. i가 그릇이 더 크므로.. overflow -> 형변환을 하는 이유는 형 타입을 맞춰줘야하기 때문
		// 책 40 ~45 page
		
		
	}
}

