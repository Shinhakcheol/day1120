package inheritance;

class InterSub implements InterTest {

	@Override
	public void display() {
		System.out.println("Override된 메서드..");
	}

}

public class Test04{
	public static void main(String[] args) {
		InterTest inter=new InterSub();
		inter.display();
		
		//The static field InterTest.a should be accessed in a static way
		//static way : InterTest.a
		System.out.println(InterTest.a);
		System.out.println(InterTest.str);
		
		//The final field InterTest.a cannot be assigned		
		//inter.a=10; //final는 수정불가
		//The final field InterTest.str cannot be assigned
		//inter.str="안녕하세요";
		
	}
	
	
}