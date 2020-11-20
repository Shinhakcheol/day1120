package inheritance;

public interface InterTest {
	//무조건 final필드 입니다. 생략해서 써도되요.
	//static 핑드 입니다.
	int a=0;
	final String str="안녕하세요 문자열 변경 불가능 합니다.";
	final static double b=3.14;
	
	//인터페이스에서 사용하는 필드는
	//final static 필드 입니다.
	//생략되어있다..
	
	//abstract 키워드 불필요.
	
	
	void display();
	
	
	default void disp() {
		
	}
	static void disp_2() {
		
	}
	//interface 생성자을 만들수가 없다.
	//Interface(){}
	//다중구현가능,
}
