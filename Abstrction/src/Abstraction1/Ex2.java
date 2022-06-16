package Abstraction1;
interface Lang
{
	void comm();
}
class Telugu implements Lang
{
	public void comm()
	{
		System.out.println("telugu");
	}
}
class Kannada implements Lang
{
	public void comm()
	{
		System.out.println("kannada");
	}
}
class Hindi implements Lang
{
	public void comm()
	{
		System.out.println("hindi ");
	}
}
class User2
{
	static void talk(Lang l)
	{
		l.comm();
	}
}
public class Ex2 {

	public static void main(String[] args) {	 
	
     Telugu c=new Telugu();
     Kannada p=new Kannada(); 
     Hindi k=new Hindi();
     
      User2.talk(c);
      User2.talk(k);
      User2.talk(p);
	}
}
