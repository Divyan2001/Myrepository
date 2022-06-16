package Abstraction1;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="catmatandcatmat";
		int count=0;
		for(int i=0;i<s1.length();i=i+3)
		{
			if("and".equals(s1.substring(i,i+3)))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
