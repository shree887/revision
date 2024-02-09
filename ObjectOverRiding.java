class Student
{
	static int unique =10001;
	String name ;
	String place ;
	Student(String name , String place)
	{
		this.name = name ;
		this.place = place;
	}

	public int hashCode()
	{
		return unique++;
	}
}
class ObjectOverRiding
{
	public static void main(String[] args) 
	{
		Student a = new Student("Ramesh","PUNE");
		Student b = new Student("Suresh","MUmbai");
		Student c = new Student("Suresh","MUmbai");
		Student d = new Student("Suresh","MUmbai");
		Student e = new Student("Suresh","MUmbai");
		Student f = new Student("Suresh","MUmbai");
		Student g = new Student("Suresh","MUmbai");

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		System.out.println(e.hashCode());
		System.out.println(f.hashCode());

	}
}