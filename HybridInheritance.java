package abstractiondemo;

class Ability
{
  public void show()
  {
    System.out.println("I am a person, I can speak and run !!");
  }
}
//child interface 
interface Moveable
{
  public void run();
}

//child interface
interface Speakable
{
  public void speak();
}

// inheriting two base interfaces
class Person extends Ability implements Moveable, Speakable
{
  @Override
  public void run()
  {
    System.out.println("I can run !!");
  }
  @Override
  public void speak()
  {
    System.out.println("I can speak !!");
  }
}
public class HybridInheritance
{
  public static void main(String[] args)
  {
  Person  obj= new Person();
  obj.run();
  obj.speak();
  obj.show();
  
  }
}
