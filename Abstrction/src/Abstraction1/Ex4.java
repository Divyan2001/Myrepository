package Abstraction1;
interface Phonepe
{
	void trans();
}
class Swiggy implements Phonepe
{
	public void trans()
	{
		System.out.println("Swiggy");
	}
}
class Redbus implements Phonepe
{
	public void trans()
	{
		System.out.println("Redbus");
	}
}
class Practo implements Phonepe
{
	public void trans()
	{
		System.out.println("practo pay");
	}
}
class User4
{
	static void talk(Phonepe j)
	{
		j.trans();
	}
}
public class Ex4 {

	public static void main(String[] args) {	 
	
     Swiggy c=new Swiggy();
     Redbus p=new Redbus(); 
     Practo k=new Practo();
     
      User4.talk(c);
      User4.talk(p);
      User4.talk(k);
	}
}
