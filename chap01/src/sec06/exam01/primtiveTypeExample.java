package sec06.exam01;

public class primtiveTypeExample {
	public static void main(String[] args) {
		/*
		 *  원시타입 vs 참조타입(Reference Type)
		 */
		// 총 8개 -> 원시타입은 소문자로 시작한다.
		// byte, short, int, long
		// byte < short < int < long < float < double
		byte var1 = 127; // MAX: 127
		short var2 = -129; 
		var1 = (byte)var2; // underflow
		System.out.println("var1 : " + var1);
		// float, double
		// char
		// boolean
		// 원시타입은 리터럴 값을 저장한다. 
		
		float var3 = 10.123f;
		int var4 = (int)var3;
		System.out.println("var4 : "+ var4);
		
	}
}
