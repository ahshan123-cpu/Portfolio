public class sum
{
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("sum of a and b is: "+c);
	}
	public static void main(String args[])
	{
		System.out.println("This is Addition program");
		sum s=new sum();
		s.add();
	}

}