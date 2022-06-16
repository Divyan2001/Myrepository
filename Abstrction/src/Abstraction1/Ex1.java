package Abstraction1;
interface Birds
{
	void noise();
}
class Crow implements Birds
{
	public void noise()
	{
		System.out.println("crra craa");
	}
}
class Koel implements Birds
{
	public void noise()
	{
		System.out.println("koel kole");
	}
}
class Parrot implements Birds
{
	public void noise()
	{
		System.out.println("parot parot ");
	}
}
class User1
{
	static void bird(Birds b)
	{
		b.noise();
	}
}
public class Ex1 {

	public static void main(String[] args) {	 
	
     Crow c=new Crow();
     Parrot p=new Parrot(); 
     Koel k=new Koel();
     
      User1.bird(c);
      User1.bird(k);
      User1.bird(p);
	}
}
