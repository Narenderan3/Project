class Test10
{
	static void show()
	{
		System.out.println("Base class");
	}
}
 class Test11 extends Test10
{
	static void show()
	{
		System.out.println("Dervied class");
		Test10.show();
	}
}
public class TestStatic {
	public static void main(String args[])
	{
		Test11 obj=new Test11();
		obj.show();
	}

}
