
class Demo
{
	public static void main(String[] args) {
		System.out.println("HELLO MAIN");
		m1();
		System.out.println(10/0);
	}
	public static void m1()
	{
		System.out.println("m1()");
		m2();
	}
	public static void m2()
	{
		System.out.println("m2()");
		m3();
	}
	public static void m3()
	{
		System.out.println("m2()");
	}
}