package Withourusingthirdvariable;

class Test1
{
	
	public void A() {
		System.out.println(" method a");
	}
	public void b() {
        System.out.println(" Method b");		
	}
	public void c() {
		System.out.println("Method c");
		
	}
}
 class Test2 extends Test1 {
	public void D() {
		System.out.println("Method d");
		
	}
	public void e() {
		System.out.println("Method e");
		
	}
}
class inherance{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = new Test2();
				t.A();
	}

}
