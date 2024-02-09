class Parent 
{
	Parent()
	{
		System.out.println("PArent Cons");
	}
	Parent(int a )
	{
		this();
		System.out.println(" PArent 1 argu");
	}
}
class Child  extends Parent
{
	Child()
	{
		this(10);
		System.out.println("No argu const");
	}
	Child(int a)
	{
		this(10,20);
		System.out.println("1 argu const");
	}
	Child(int a, int b)
	{
		super(10);
		System.out.println("2 argu const");
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		Child a  = new Child();
	}
}