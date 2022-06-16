package Abstraction1;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar={2,3,4,5,3,5,3,3};
		int count =0;
		int giv=3;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==giv)
			{
				count++;
			}
		}
System.out.println(count);
	}

}
