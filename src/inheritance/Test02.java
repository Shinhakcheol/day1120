package inheritance;

abstract class Super{
	//추상메서드
	abstract void disp();
	public Super() {
		
	}
}

class Sub01 extends Super{
	
	//재정의
	@Override
	void disp() {
		System.out.println("Sub");
	}
}
class Sub02 extends Super{

	@Override
	void disp() {
		
	}
	
}

public class Test02 {
	public static void main(String[] args) {
		

		
		//다형성..
		Super su01=new Sub01();
		su01.disp();
				
	}
}
