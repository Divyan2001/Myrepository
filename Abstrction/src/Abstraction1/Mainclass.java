package Abstraction1;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Mainclass {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar={10,20,30,10,20,40,50};
		LinkedHashMap<Integer,Integer> l1=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<ar.length;i++)
		{
			if(!l1.containsKey(ar[i]))
			{
			l1.put(ar[i],1);
			}
			else
			{
				int x=l1.get(ar[i]);
				x++;
				l1.put(ar[i],x);
			}
		}
		for(Entry a:l1.entrySet())
		{
			if(l1.get(a.getKey())>1)
			{
				System.out.println(a.getKey()+" "+a.getValue());
			}
		}

	}

}
