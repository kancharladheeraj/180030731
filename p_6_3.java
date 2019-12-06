class Person
{
	 void print(){System.out.println("i am person");}
}
class Student extends Person
{
	void print(){System.out.println("i am student");}
}
class teacher extends Person
{
	void salary(){System.out.println("salary : 50000");}
	void subject(){System.out.println("subject :Computer Science");}
}
class CollegeStudent extends Student
{
	void year(){System.out.println("b.tech 2nd year");}
	void major(){System.out.println("Electrical Engineering");}
}
class p_6_3
{
	public static void main(String args[])
	{
	CollegeStudent c=new CollegeStudent();
	c.year();
	c.major();
	c.print();
	teacher t=new teacher();
	t.salary();
	t.subject();			
	t.print();

	}
}