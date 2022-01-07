class First 
{

	private static First t=null;
	private First()
	{
	}
	public static First getInstance()
	{
		if(t==null)
		{
			t=new First();
		}
		return t;
	}
	public void method1()
	{
		System.out.println("This is first method");
	}
	
}
class Second
{
		public static void main(String args[])
		{
			First f1=First.getInstance();
			f1.method1();		
		}
}