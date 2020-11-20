package inheritance;

class AAA{
	int a;
	int b;
	
	void method01() {
		System.out.println(a);
		System.out.println(b);
	}
}


public class Test01 extends AAA{
	void disp() {
		System.out.println(super.a);
		System.out.println(super.b);
		super.method01();
	}

}
