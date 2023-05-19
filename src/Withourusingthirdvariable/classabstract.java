package Withourusingthirdvariable;

abstract class Animal{
	
	void get_number_of_leg(){
		System.out.println(2);
	}
	
}





public class classabstract extends Animal {

	public static void main(String[] args) {
		Animal ab = new classabstract(); {
			ab.get_number_of_leg();
		}

	}

}
