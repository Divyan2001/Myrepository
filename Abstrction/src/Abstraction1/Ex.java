package Abstraction1;
interface Resturants
{
	void food();
}
class Veg implements Resturants
{
	public void food()
	{
		System.out.println("veg food");
	}
}
class Nonveg implements Resturants
{
	public void food()
	{
		System.out.println("nonveg food");
	}
}
class VegNonveg implements Resturants
{
	public void food()
	{
		System.out.println("both ");
	}
}
class User
{
	static void order(Resturants r1)
	{
		r1.food();
	}
}
public class Ex {

	public static void main(String[] args) {	 
	
     Veg v=new Veg();
     Nonveg n=new Nonveg();
     VegNonveg g=new VegNonveg();
      User.order(v);
      User.order(n);
      User.order(g);
	}
}
