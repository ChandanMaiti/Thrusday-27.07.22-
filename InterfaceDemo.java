package abstractiondemo;

interface Printable{
	int x=100;
	void display();
	void fun();
	void draw();
	
}
interface Drawable extends Printable 
{
	void draw();
	
}
interface sayable
{
void say();

}

class Print implements Drawable
{

	@Override
	public void display() {
		System.out.println("Display the message");
		
	}

	@Override
	public void fun() {
		System.out.println("Fun learning");
		
	}

	@Override
	public void draw() {
		System.out.println("Drwaing somthing");
		
	}
	
}
class message implements Drawable,sayable
{

	@Override
	public void display() {
		System.out.println("Hellow World");
		
	}
	@Override
	public void fun() {
		System.out.println("Hii, i am doing fun");
		
	}
	@Override
	public void say() {
		System.out.println("Hello world");
		
	}
	@Override
	public void draw() {
		System.out.println("Draw circle");
		
	}
}
	
	
public class InterfaceDemo {

	public static void main(String[] args) {
		
		// you cant create instantiate but you can create reference variable.
		Printable p=new Print();
		p.display();
		p.fun();
		p.draw();
		
		message msg=new message();
		msg.display();
		msg.fun();
		msg.say();
		msg.draw();
		msg.say();
		System.out.println(Drawable.x);
	}

}

