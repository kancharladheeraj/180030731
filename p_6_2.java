public class p_6_2 extends Employee
{
	public static void main(String args[])
	{
	Person p=new Person("Ram");
	Employee e=new Employee(535.20,2001,"jd782dk");
	System.out.println(p.getname()+"\n"+e.getannualsalary()+"\n"+e.getstarttowork()+"\n"+e.getnationalinsurance());
	}
}