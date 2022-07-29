package abstractiondemo;

//we can't create instance but we can create reference variable
abstract class Bank
{
	//abstract method-method has no body
	abstract void getLoanInterst();
	
//concrete method-method has body
	public void display()
	{
		System.out.println("This a bank class.");
		
	}
}
//implement class
class SBI extends Bank
{

	@Override
	void getLoanInterst() {
		System.out.println("We are providing 6.7% interest");
		
	}
	
}

class AXIS extends Bank
{

	@Override
	void getLoanInterst() {
		System.out.println("We are providing 10% interest");
		
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		Bank b=new SBI();
		b.getLoanInterst();
		b.display();
		
		AXIS axis=new AXIS();
		axis.getLoanInterst();
		axis.display();

	}

}
