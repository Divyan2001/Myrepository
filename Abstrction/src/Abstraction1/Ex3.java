package Abstraction1;
interface Jiotv
{
	void watch();
}
class Star implements Jiotv
{
	public void watch()
	{
		System.out.println("Startv");
	}
}
class Zee implements Jiotv
{
	public void watch()
	{
		System.out.println("zeekannada");
	}
}
class Colors implements Jiotv
{
	public void watch()
	{
		System.out.println("Colors ");
	}
}
class User3
{
	static void talk(Jiotv j)
	{
		j.watch();
	}
}
public class Ex3 {

	public static void main(String[] args) {	 
	
     Star c=new Star();
     Zee p=new Zee(); 
     Colors k=new Colors();
     
      User3.talk(c);
      User3.talk(k);
      User3.talk(p);
	}
}
